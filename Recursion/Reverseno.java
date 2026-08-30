public class Reverseno {
    public static void main(String[] args) {    
        //  reverse2(12345);
    System.out.println(contzero(120603));
    }
//     static  int sum=0;
//  public static void reverse1(int n) {
//     if(n==0){
//         return ;
//     }
//     int rem=n%10;
//     sum=sum*10+rem;
//     reverse1(n/10);
//  }
// public static int reverse2(int n) {
//     // int digits=(int)(Math.log10(n))+1;
//     return helper(n,0);
// }
// private static int helper(int n, int rev) {
//     if(n%10==0){
//         return rev;
//     }
//     int rem=n%10;
//     // return rem*(int)Math.pow(10, digits-1)+helper(n/10, digits-1);
//     return  helper(n/10, rev*10+rem);
// }

public static int contzero(int n) {
    return counthelper(n, 0);
}
public static int  counthelper(int n,int c) {
 if(n==0){
        return c;
    }
    int rem=n%10;
    if(rem==0){
        return counthelper(n/10, c+1);
    }
    return counthelper(n/10, c);
}

}
