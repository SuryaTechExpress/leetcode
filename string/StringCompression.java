package string;

public class StringCompression {
    public static void main(String[] args) {
        String str = "DDDRRJJAAA";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder();
        char c = str.charAt(0);
        int count = 0;

        for (int i=1;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }else {
                sb.append(c);
                sb.append(count);

                c = str.charAt(i);
                count=1;
            }
        }
        sb.append(c);
        sb.append(count);
        return sb.toString();
    }
}
