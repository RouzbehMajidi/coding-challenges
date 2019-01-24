class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        char[] chars = s.toCharArray();

        for(char c : chars){
            Character lastChar = stack.peek();

            if(c == '}' && lastChar != null && lastChar == '{'){
                stack.pop();
            }else if(c == ']' && lastChar != null && lastChar == '['){
                stack.pop();
            }else if(c == ')' && lastChar != null && lastChar == '('){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        return stack.size() == 0 ? true : false;

    }
}