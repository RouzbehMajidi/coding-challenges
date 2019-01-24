import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        
        for(int i = 0; i < s.length(); i ++){
            Character currentChar = s.charAt(i);
            Character lastChar = stack.peek();
            
            
            if((lastChar != null)
               && ((lastChar == '{' && currentChar == '}') 
               || (lastChar == '[' && currentChar == ']')
               || (lastChar == '(' && currentChar == ')'))){ 
                stack.pop();
            }else{
                stack.push(currentChar);
            }
        }
        return (stack.size() == 0) ? "YES" : "NO";
    }
}
