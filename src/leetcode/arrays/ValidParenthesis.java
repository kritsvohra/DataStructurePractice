package leetcode.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

    public static boolean isValid(String s){

        Deque<Character> stack = new ArrayDeque<Character>();

        char[] ch = s.toCharArray();
        for (int i = 0; i< ch.length; i++){
            if (ch[i] == '[' || ch[i] == '(' || ch[i] == '{'){
                stack.push(ch[i]);
            }else {
                if (stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if ((ch[i] == ']' && top != '[')|| (ch[i] == '}' && top != '{') || (ch[i] == ')' && top != '(')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {

        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([])"));    // true
        System.out.println(isValid("([)]"));    // false
    }
}
