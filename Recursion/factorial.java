public class factorial {
 public static void main(String[] args) {
   
 }  
    public static int fact(int n) {
        if (n==1) {
            return 1;
        }
        return n*fact(n-1);

 } 
 public static int prductofdigit(int n) {
    if(n%10==n){
        return n;
    }
    return (n%10)*prductofdigit(n/10);
 }
  public static int sumofdigit(int n) {
    if(n==1){
        return 1;
    }
    return (n%10)*sumofdigit(n/10);
 }
 
  
}
