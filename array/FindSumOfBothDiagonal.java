package array;

public class FindSumOfBothDiagonal {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Both Diagonal Sum : "+findSumOfBothDiagonal(array));
    }
    public static int findSumOfBothDiagonal(int[][] array){
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i=0;i<array.length;i++){
            firstDiagonalSum+=array[i][i];
            secondDiagonalSum+=array[i][array.length-1-i];
        }
        System.out.println("First Diagonal Sum : "+firstDiagonalSum);
        System.out.println("Second Diagonal Sum : "+secondDiagonalSum);
        return firstDiagonalSum+secondDiagonalSum;
    }
}
