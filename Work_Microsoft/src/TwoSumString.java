import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class TwoSumString {


    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (!set.add(c)) {
                return set.size();
            }
        }
        return set.size();
    }

    public static boolean isPalindrome(int x) {
        StringBuilder builder = new StringBuilder();
        builder.append(x).reverse();
        if (builder.toString().equals(x + "")) {
            return true;
        }
        return false;
    }

    public static int romanToInt(String s) {
        if (1 > s.length() || s.length() > 15) {
            return -1;
        }
        int res = 0;
        int prev = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (Character c : s.toCharArray()) {
            int value = map.get(c);
            res += value;
            if (value > prev) {
                res -= 2 * prev;
            }
            prev = value;
        }
        return res;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length < 1 || strs.length > 200) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < strs[0].length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                builder.append(first.charAt(i));
            } else {
                break;
            }
        }
        return builder.toString();
    }


    public boolean isValid(String str) {
        if (str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }



    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


}
