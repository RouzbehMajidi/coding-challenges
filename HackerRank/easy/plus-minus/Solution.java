public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float postiveRatio = 0;
        float negativeRatio = 0;
        float zeroRatio = 0;
        
        for(int value : arr){
            if(value > 0){
                postiveRatio += 1;
            }else if(value < 0){
                negativeRatio += 1;
            }else {
                zeroRatio += 1;
            }
        }
        
        System.out.println(postiveRatio/arr.length);
        System.out.println(negativeRatio/arr.length);
        System.out.println(zeroRatio/arr.length);
    }
}