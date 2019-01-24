public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
            int numberOfValleys = 0;
            int currentAltitude = 0;
            boolean isValley = false;

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'U':
                    currentAltitude ++;
                    break;
                case 'D':
                    currentAltitude --;
                    break;
            }

            if(currentAltitude < 0 && !isValley){
                numberOfValleys ++;
                isValley = true;
            }else if (currentAltitude >= 0) {
                isValley = false;
            }
        }

        return numberOfValleys;


    }
}