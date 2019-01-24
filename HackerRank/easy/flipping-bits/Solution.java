public class Solution {
    private static final long maxValue = (long) Math.pow(2,32);

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
        return (maxValue - n - 1);
    }
}