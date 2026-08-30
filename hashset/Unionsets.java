import java.util.*;
public class Unionsets {
    public static void main(String[] args) {
        int a[] = {1, 1, 2, 3, 4, 5};
        int b[] = {2, 3, 3, 4, 5, 6};
        System.out.println(union(a, b));

    }

    public static ArrayList<Integer> union(int[] a,int[] b){
      int m=a.length;
      int n=b.length;
      int i=0;
      int j=0;
      ArrayList<Integer> Union=new ArrayList<>();
      while(i<m && j<n){
        if(a[i]<=b[j]){
          if(Union.isEmpty()   || Union.get(Union.size()-1)!=a[i]){
            Union.add(a[i]);
          }
          i++;
        }
          else{
            if(Union.isEmpty() || Union.get(Union.size()-1)!=b[j]){
                Union.add(b[j]);
            }
                j++;
            }
          }
      while(i<m){
        if(Union.get(Union.size()-1)!=a[i]){
            Union.add(a[i]);
        }
        i++;
      }
      while(j<n){
        if(Union.get(Union.size()-1)!=b[j]){
            Union.add(b[j]);
        }
        j++;
      }
    return Union;
    }
}
