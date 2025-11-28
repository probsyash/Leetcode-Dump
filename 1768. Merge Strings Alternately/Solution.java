/* 
 * Not the best time complexity!
 * Learnt var.charAt(i) != null does not work! --> null only works with reference types!
 * charAt returns a primitive type (char). Reference types are things like String, Arrays, Integers...
 */

import java.util.Scanner;

class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int max;
        String mergedString = "";

        if (word1.length() < word2.length()){
            max = word1.length();
        }
        else{
            max = word2.length();
        }

        for(int i = 0; i < max; i++){
            mergedString = mergedString + word1.charAt(i) + word2.charAt(i);
        }

        if (max < word1.length()){
            for(int i = max; i < word1.length(); i++){
                mergedString = mergedString + word1.charAt(i);
            }
        }
        else if (max < word2.length()){
            for(int i = max; i < word2.length(); i++){
                mergedString = mergedString + word2.charAt(i);
            }
        }

        return mergedString;
    }

    public static void main(String[] params){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word 1: ");
        String word1 = scanner.nextLine();
        System.out.print("Word 2: ");
        String word2 = scanner.nextLine();

        String ans = mergeAlternately(word1, word2);

        System.out.println(ans);
        scanner.close();

        return;
    }
}