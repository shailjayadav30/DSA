public class Recursion {
    public static void main(String[] args) {
        int k=10;
        System.out.println(sum1(k));
        sum1(9);
    }
    public static int sum1(int k){
        int sum=0;
        sum=sum+k;
return sum;
    }
}
