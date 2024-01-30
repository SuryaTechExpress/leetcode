package string;

public class ReplaceString {
    public static void main(String[] args) {
        String str = "Hello World!";
        String oldSubstring = "World";
        String newSubstring = "Java";
        String newString = str.replace(oldSubstring, newSubstring);
        System.out.println(newString);
    }
}
