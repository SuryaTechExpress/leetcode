package leetcode.easy;

public class FindIndexOfFirstOccurrenceInAString {
    public static void main(String[] args) {
//        test1
       String  haystack1 = "leetcode", needle1 = "leeto";
        System.out.println(strStr(haystack1,needle1));

//       test2
        String haystack2 = "sadbutsad", needle2 = "sad";
        System.out.println(strStr(haystack2,needle2));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack==null && haystack.isEmpty()) return 0;

        return haystack.indexOf(needle);
    }
}
