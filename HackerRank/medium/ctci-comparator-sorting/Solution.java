import java.util.*;

public class Solution {
    class Checker implements Comparator<Player> {
        // complete this method
    public int compare(Player a, Player b) {
        if(a.score > b.score){
            return -1;
        }else if(a.score < b.score){
            return 1;
        }else{
            for(int i = 0; i < Math.max(a.name.length(), b.name.length()); i++){
                if(i == a.name.length()){
                    return -1;
                }
                if(i == b.name.length()){
                    return 1;
                }
                if(a.name.charAt(i) > b.name.charAt(i)){
                    return 1;
                }
                if(a.name.charAt(i) < b.name.charAt(i)){
                    return -1;
                }
            }
            return 0;
        }
    }
    }
}
