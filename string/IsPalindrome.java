package string;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
