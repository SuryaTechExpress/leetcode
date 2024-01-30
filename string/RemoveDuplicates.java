package string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "surajkunar";
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String str){
        String result = "";
        for (char c : str.toCharArray()){
            if(!result.contains(String.valueOf(c))){
                result+=c;
            }
        }
        return result;
    }
}
