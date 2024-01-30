package string;

import java.util.Arrays;

public class CountVowelsConsonents {
    public static void main(String[] args) {
        String str = "aeiou";
        System.out.println(Arrays.toString(countVowelsConsonents(str)));
    }

    public static int[] countVowelsConsonents(String str){
        int vowels = 0;
        int consonents = 0;

        for (char c : str.toLowerCase().toCharArray()){
            if(c>='a' && c<='z'){
                if("aeiou".contains(String.valueOf(c))){
                    vowels++;
                }else {
                    consonents++;
                }
            }
        }
        return new int[]{vowels, consonents};
    }


}
