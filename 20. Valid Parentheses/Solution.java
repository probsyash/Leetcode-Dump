import java.util.*;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean flag;

        for(int i = 0; i < s.length(); i++){
            flag = false;
            char current = s.charAt(i);
            if(!stack.isEmpty()){
                char last = stack.peek();
                if(isPair(last, current)){
                    flag = true;
                    stack.pop();
                }
            }
            if(flag == false){
                stack.push(current);
            }
        }

        return stack.isEmpty();
    }

    public static boolean isPair(char last, char current){
        return (last == '(' && current == ')') ||
               (last == '{' && current == '}') ||
               (last == '[' && current == ']');
    }

    public static void main(String[] params){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String input = scanner.nextLine();

        System.out.println(isValid(input));
    }
}