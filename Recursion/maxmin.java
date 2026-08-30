public class maxmin {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, -5, -4, 8, 6};
        int n=arr.length;
System.out.println("min element is "+findmin(arr,n));
System.out.println("max element is "+findmax(arr,n));
    }
    public  static int findmin(int arr[],int n){
          if(n == 1){
        return arr[0];
          }
        return Math.min(arr[n-1], findmin(arr, n-1));

        }
        public  static int findmax(int arr[],int n){
          if(n == 1){
        return arr[0];
          }
        return Math.max(arr[n-1], findmax(arr, n-1));

        }
    }