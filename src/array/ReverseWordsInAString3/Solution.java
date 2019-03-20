package array.ReverseWordsInAString3;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        char[] result = new char[s.length()];
        Stack<Character> stack = new Stack<>();
        int resIndex = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 32){// space symbol
                while(!stack.empty()){
                    result[resIndex++] = stack.pop();
                }
                result[resIndex++] = 32;
            } else {
                stack.push(s.charAt(i));
            }
        }
        while(!stack.empty()){
            result[resIndex++] = stack.pop();
        }
        return new String(result);
    }

}
