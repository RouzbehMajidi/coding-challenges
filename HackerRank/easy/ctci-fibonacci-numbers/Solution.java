import java.util.*;

public class Solution {

    public static int fibonacci(int n){
        Integer[] memo = new Integer[n+1];
        return fibHelper(n, memo);
    }

    private static int fibHelper(int n, Integer[] memo){
        if(n < 2){
            memo[n] = n;
        }else if(memo[n] == null){
            memo[n] = fibHelper(n-1, memo) + fibHelper(n-2, memo);
        }
        return memo[n];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
