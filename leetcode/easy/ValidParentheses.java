package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";

        System.out.println(isValid(test1));
        System.out.println(isValid(test2));
        System.out.println(isValid(test3));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                if(c==')' && pop!='('||c=='}' && pop!='{'||c==']' && pop!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
