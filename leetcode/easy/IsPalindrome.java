package leetcode.easy;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int num){
        if(num<0)return false;
        int reversed = 0;
        int temp = num;
        while (num>0){
            reversed = (reversed*10)+num%10;
            num /=10;
        }
        return temp==reversed;
    }
}
