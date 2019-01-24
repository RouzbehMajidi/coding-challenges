class Solution {
    public int maximumSwap(int num) {
       
        int[] number = convertToIntArray(num);
        
        int currentIndex = 0;
        while(!swapMax(number, currentIndex)){
            currentIndex ++;
        }
        
        return convertToInt(number);
    }
    
    private int[] convertToIntArray(int num){
        String number = num + "";
        int[] output = new int[number.length()];
        
        for(int i = 0; i < output.length; i ++){
            output[i] = Character.getNumericValue(number.charAt(i));
        }
        
        return output;
    }
    
    private int convertToInt(int[] number){
        String num = "";
        for(int i = 0; i < number.length; i ++){
            num += number[i];
        }
        
        return Integer.parseInt(num);
    }
    
    private boolean swapMax(int[] number, int startIndex){
        
        if(startIndex == number.length){
            return true;
        }
        
        int max = number[startIndex];
        int maxIndex = startIndex;
        
        
        for(int i = startIndex; i < number.length; i ++){
            if(number[i] >= max && number[i] != number[startIndex]){
                max = number[i];
                maxIndex = i;
            }
        }
        
        if(maxIndex == startIndex){         
            return false; 
        }else {
            number[maxIndex] = number[startIndex];
            number[startIndex] = max;
            return true;
        }

    }
}