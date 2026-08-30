import java.util.HashSet;
import java.util.Arrays;
public class Hashing {
     public static void main(String[] args) {
    
     int[] arr={1,3,2,7,3,2,6,4,4,1,3};
     System.out.println(duplicate(arr));
     }
     public static int duplicate(int[]  arr){
        HashSet <Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
  set.add(arr[i]);
        }
        int size =set.size();
        int j=0;
        int[] newArr = new int[size];

        for(int x:set){
  newArr[j]=x;
  j++; 
        }
  System.out.println(Arrays.toString(newArr));

        return size;
     }
}
