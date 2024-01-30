package string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "suraj";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
