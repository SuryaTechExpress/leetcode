package string;

public class IsSubstring {
    public static void main(String[] args) {
        String s1 = "Java is an object-oriented, high-performance, and versatile programming language.";
        String s2 = "object";
        System.out.println(isSubstring(s1,s2));
    }
    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }
}
