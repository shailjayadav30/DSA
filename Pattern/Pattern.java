public class Pattern {

    public static void main(String args[]) {
        pattern13(5);
    }    
    public static void pattern1(int n){
    for(int row=1;row<=n;row++){
    for(int col=1;col<=n;col++){
    System.out.print("*");
    }
    System.out.println();
    }
    }
    
    public static void pattern2(int n){
    for (int row=1;row<=n;row++){
    for(int col=1;col<=row;col++){
    System.out.print("*");
    }
    System.out.println();
    }
    }
    
    public static void pattern3(int n){

    for(int row=1;row<=5;row++){
    for(int col=1;col<=n-row+1;col++){
    System.out.print("*");
    }
    System.out.println();
    }
    }
    
    public static void pattern4(int n){
    for(int row=1;row<=5;row++){
    for(int col=1;col<=row;col++){
    System.out.print(col+" ");
    }
    System.out.println();
    }
    }

    public static void pattern5(int n) {
    for (int row = 1; row <= ((2*n)-1); row++) {
    int totalColsInRow = row < n ? row : 2 * n - row;
    for (int col = 1; col <= totalColsInRow; col++) {
    System.out.print("*");
    }
    System.out.println();
    }
    }

    public static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int noofspaces = n - row;
            for (int s = 1; s <=noofspaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
                   int totalcolsinrow=row <= n ? row : 2*n-row;
            int noofspaces = n - totalcolsinrow;
for (int s = 1; s <=noofspaces; s++) {
                System.out.print(" ");
            }
             
            for (int col = 1; col <= totalcolsinrow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern7(int n){
  for(int row=1;row<=n;row++){
    int noofcol= n-row+1;
    int noofspace=n-noofcol;
    for(int s=1;s<=noofspace;s++){
        System.out.print(" ");
    }
    for(int col=noofcol;col>=1;col--){
        System.out.print("*");
    }
  System.out.println();
  }
 }
 
   public static void pattern8(int n) {
      for(int row=1;row<=n;row++){
        int noofcol=2*row-1;
        int noofspace=n-row;
        for(int s=0;s<=noofspace;s++){
            System.out.print(" ");
        }
        for(int col=1;col<=noofcol;col++){
      System.out.print("*");
        }
        System.out.println();
      }
 }

public static void pattern9(int n) {

    for(int row=1;row<=n;row++){
        int noofcol=2*(n-row)+1;
        int noofspace=row-1;
        for(int s=1;s<=noofspace;s++){
            System.out.print(" ");
        }
        for(int col=1;col<=noofcol;col++){
        System.out.print("*");
        }
        System.out.println();
    }
}
 
public static void pattern11(int n) { 
    System.out.println("printing pattern 11");
for(int row=1;row<=n;row++){
        int noofspace=row-1;
        int noofcol=n-row+1;
        for(int s=1;s<=noofspace;s++){
            System.out.print(" ");
        }
        for(int col=1;col<=noofcol;col++){
        System.out.print("* ");
        }
        System.out.println();
    }
}

public static void pattern12(int n) {
for(int row=1;row<=2*n;row++){
        int noofcol=row<=n?n-row+1:row-n;
        int noofspace=row<=n ?row-1 :2*n-row;
        for(int s=1;s<=noofspace;s++){
            System.out.print(" ");
        }
        for(int col=1;col<=noofcol;col++){
        System.out.print("* ");
        }
        System.out.println();
    }
}

public static void pattern13(int n) {
  for(int row=1;row<=n;row++){
    for(int s=1;s<=n-row;s++){
        System.out.print(" ");
    }
    
    for(int col=1;col<=(2*row-1);col++){
        if(col==1||col==(2*row-1)||row==n){
        System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
  }  
}
}
