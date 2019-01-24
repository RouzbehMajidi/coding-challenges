public class Solution {

    // Complete the minimumAbsoluteDifference function below.
    public static int minimumAbsoluteDifference(Integer[] input){
        List<Integer> sortedList = Arrays.asList(input);
        Collections.sort(sortedList);

        int minimumAbsoluteDifference = Integer.MAX_VALUE;

        for(int i = 0; i < sortedList.size() - 1; i ++){
            int currentAbsoluteDifference = Math.abs(sortedList.get(i) - sortedList.get(i + 1));

            if(currentAbsoluteDifference < minimumAbsoluteDifference){
                minimumAbsoluteDifference = currentAbsoluteDifference;
            }
        }

        return minimumAbsoluteDifference;
    }
}