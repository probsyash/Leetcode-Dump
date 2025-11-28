import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false; // negative numbers can't be palindrome

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(isPalindrome(input));
        scanner.close();
    }
}
