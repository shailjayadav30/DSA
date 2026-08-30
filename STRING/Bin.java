// import java.util.Arrays;

public class Bin {
    public static void main(String[] args) {
        int[] arr={3,9,7,4,58,8,0};
        int searchvalue= 8;
        // System.out.println(Arrays.toString(sort(arr)));
        System.out.println(search(arr, searchvalue));

    }
//     public static int[] sort(int[] arr){
//    for(int i=0;i<arr.length;i++){
//      for(int j=i+1;j<arr.length;j++){

//             if(arr[i]>arr[j]){b
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;

//             }    }
//      }
// return arr;
//    }
   public static int search(int[] arr , int target){
   int start=0;
   int end=arr.length;
   while(start<end){
     int mid=start+ (end-start)/2;
     if(target== arr[mid]){
        return mid;
     }
     if(arr[mid]<target){
        start=mid+1;
     }
     if(arr[mid]>target){
        end=mid-1;
     }
   }
return -1;
   }
}
