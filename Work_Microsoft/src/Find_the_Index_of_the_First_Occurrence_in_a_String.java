import java.util.Arrays;
import java.util.Stack;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        System.out.println(skobki("({[]})"));
        System.out.println(skobki("("));
    }

    public static boolean skobki(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (c == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

        public int strStr (String haystack, String needle){
            if (haystack.length() < needle.length()) {
                return -1;
            }
            boolean flag = false;

            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    flag = true;
                    for (int j = 1; j < needle.length(); j++) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    return i;
                }
            }
            return -1;
        }
    }
