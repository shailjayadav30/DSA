

public class palindrome {
    public static void main(String[] args) {
        int y = 12;
        int ans = isPalindrome(y);
        System.out.println(ans);
    }

    public static int isPalindrome(int y) {
        if (y < 0) {
            return -1; // Negative numbers are not palindromes
        }

        int reversed = 0;
        int original = y;

        while (y > 0) {
            int digit = y % 10;
            reversed = reversed * 10 + digit;
            y /= 10;
        }

        if (reversed == original) {
            return original;
        }

        return -1;
    }
}
