package string;

public class CaseInsensitiveSubstringComparison {
    public static void main(String[] args) {
        String str = "Hello World!";
        String substring = "world";

        if(str.toLowerCase().contains(substring.toLowerCase())){
            System.out.println("substring found (case-insensitive)");
        }else{
            System.out.println("substring not found case-insensitive");
        }
    }
}
