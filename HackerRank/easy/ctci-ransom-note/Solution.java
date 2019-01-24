public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        boolean validNote = true;
        HashMap<String,Integer> availableWords = new HashMap<String,Integer>();

        for(String word: magazine){
            Integer count = availableWords.get(word);
            if(count == null){
                availableWords.put(word,1);
            }else {
                availableWords.put(word, count+=1);
            }
        }

        for(String word: note){
            Integer count = availableWords.get(word);
            if (count == null || count == 0){
                validNote = false;
                break;
            }else if(count > 0){
                count -=1;
                availableWords.put(word,count);
            }
        }

        if (validNote){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}