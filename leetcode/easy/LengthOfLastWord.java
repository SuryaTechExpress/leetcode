package leetcode.easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
       String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        String[] array = s.trim().split(" ");
        String lastElement = array[array.length-1];
        return lastElement.length();
    }

}
