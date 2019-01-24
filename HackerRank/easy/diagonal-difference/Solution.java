public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        return Math.abs(leftDiagonalSum(arr) - rightDiagonalSum(arr));
    }
    
    private static int leftDiagonalSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[i][i];
        }
        return sum;
    }
    
    private static int rightDiagonalSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i ++){
            sum += arr[arr.length - i - 1][i];
        }
        return sum;
    }
}