public class Bnarysearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,33,78,98};
         int target=  98;
         int ans=binary(arr, target, 0,arr.length );
         System.out.println(ans);
    }
    public static  int binary(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binary(arr, target, mid+1, e);
        }
        
            return binary(arr, target, s, mid-1);
        
    }
}
