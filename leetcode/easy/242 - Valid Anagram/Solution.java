class Solution {

    public boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        HashMap<Character,Integer> histogram = new HashMap<Character,Integer>();

        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        for(char c: a1.toCharArray()){
            Integer frequency = histogram.get(c);

            if( frequency == null){
                frequency = 0;
            }

            histogram.put(c, frequency + 1);
        }

        for(char c: b1.toCharArray()){
            Integer frequency = histogram.get(c);

            if( frequency == null){
                return false;
            }

            histogram.put(c, frequency - 1);
        }

        for(Integer frequency : histogram.values()){
            if(frequency != 0){
                return false;
            }		
        }

        return true;

    }

}