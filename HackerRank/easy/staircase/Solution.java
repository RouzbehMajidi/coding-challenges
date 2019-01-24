public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        printLevel(1,n);
    }
    
    private static void printLevel(int level, int totalLevels){
        if(level > totalLevels)
            return;
        if(level > 1)
            System.out.println();
        
        for(int i = 0; i < totalLevels; i++){
            if(i < totalLevels - level){
                System.out.print(" ");
            }else{
                System.out.print("#");
            }
        }
        
        printLevel(level + 1, totalLevels);
    }
}