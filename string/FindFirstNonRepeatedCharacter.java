package string;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "surajkumasah";
        System.out.println(findFirstNonRepeatedCharacter(str));
    }
    public static char findFirstNonRepeatedCharacter(String str){
        if(str==null || str.length()==0) return '\0';
        for (char c : str.toCharArray()){
            if(str.indexOf(c)==str.lastIndexOf(c)){
                return c;
            }
        }
        return '\0';
    }
}
