public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int position = 0;
        int steps = 0;

        while(position < c.length){
            if(position + 2 < c.length && c[position + 2] != 1){
                position += 2;
                steps ++;
            }else if(position + 1 < c.length && c[position + 1] != 1){
                position += 1;
                steps ++;
            }else {
                break;
            }
        }

        return steps;

    }
}