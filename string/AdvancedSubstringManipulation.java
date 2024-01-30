package string;

public class AdvancedSubstringManipulation {
    public static void main(String[] args) {
        String str = "Java Programming is Fun!";
        int index = str.indexOf("Programming");
        String priffix = str.substring(0,index);
        String suffix = str.substring(index+("Programming".length()));

        System.out.println("Preffix : "+priffix);
        System.out.println("Suffix : "+suffix);
    }
}
