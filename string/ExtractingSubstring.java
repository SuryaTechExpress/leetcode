package string;

public class ExtractingSubstring {
    public static void main(String[] args) {
        String str = "Hello World!";
        int startIndex = 6;
        int endIndex = 11;
        String substring = str.substring(startIndex, endIndex);
        System.out.println(substring);
    }
}
