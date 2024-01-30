package string;

public class FindSubstring {
    public static void main(String[] args) {
        String str = "Hello World";
        String substring = "World";
        System.out.println(findSubstring(str,substring));

    }

    public static String findSubstring(String str, String substring){
        if(str==null || substring==null) return "substring not found";
        if(str.contains(substring)) return "Substring found";
        else return "Substring not found";
    }
}
