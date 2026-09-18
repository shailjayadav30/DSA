public class MergeSort {
    public static void mergesort(int arr[], int low, int high) {


        if(low>=high){
return;
        }
        int mid = low+(high-low) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[]=new int[high-low+1];
        int left = low;
        int right = mid + 1;
        int i=0;
        while (left <= mid && right <= high) {
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
            }
            else{
                temp[i]=arr[right];
                right++;
            }
i++;
        }
    while(left<=mid){
        temp[i]=arr[left];
        left++;
        i++;
    }
    while(right<=high){
        temp[i]=arr[right];
        right++;
        i++;
    }
     for(i=0;i<temp.length;i++){
        arr[low+i]=temp[i]; 

     }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 1, 2, 6, 7, 8, 9, 10, 3, 4, 5 };
        int low = 0;
        int high = arr.length -1;
        mergesort(arr, low, high);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

}
