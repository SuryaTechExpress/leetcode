package string;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "I Love Programming Very Much";
        System.out.println(reverseWord(str));
    }
    public static String reverseWord(String words){
        StringBuilder sb = new StringBuilder();
        for(String s : words.trim().split(" ")){
            sb.append(new StringBuilder(s).reverse()+" ");
        }
        return sb.toString().trim();
    }
}
