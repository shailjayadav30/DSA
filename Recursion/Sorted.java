public class Sorted {
    public static void main(String[] args) {
        int[] arr={1,8,3,5,2,9};
        int ans=returnindex(arr, 9, 0);
System.out.println(ans);
    }
//check if array is sorted or not 
    static boolean sort(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        
        return arr[index]<arr[index+1] && sort(arr,index+1);

    }

//returns booolean value if present or not
static boolean linearsearch(int[] arr,int target,int index){
    if(index==arr.length){
   return false ; 
}

return arr[index]==target || linearsearch(arr, target, index+1);
}
 //returns index value if no present 
static int returnindex(int[] arr,int target,int index){
    if(index==arr.length){
   return -1 ; 
}
if(arr[index]==target){
     return index;
}
return  returnindex(arr, target, index+1);
}

}
