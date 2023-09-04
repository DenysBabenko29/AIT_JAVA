public class Main2_BKT {
    public static void main(String[] args) {
        String str = "{[(){}](<>)}";
        System.out.println(checkedByCorrect(str));
    }

    public static boolean checkedByCorrect(String str) {
        if (isClose(str.charAt(0)) || (str.length() % 2) != 0) {
            return false;
        }
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        if (flag){
            for (char c : str.toCharArray()){
                if (isOpen(c)){
                    builder.append(c);
                } else if (isClose(c)){
                    int lastOfIndex = builder.length() - 1;
                    char res = returnChar(c);
                    if (isOpen(builder.charAt(lastOfIndex)) && builder.charAt(lastOfIndex) == res){
                        builder.deleteCharAt(lastOfIndex);
                    }
                } else {
                    flag = false;
                }
            }
        }
        if (builder.length() == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOpen(char c){
        if (c == '{' || c == '(' || c == '[' || c == '<'){
            return true;
        }
        return false;
    }

    public static boolean isClose(char c) {
        if (c == '}' || c == ')' || c == ']' || c == '>') {
            return true;
        }
        return false;
    }

    public static char returnChar(char c) {
        if (c == ')') {
            return '(';
        } else if (c == '}') {
            return '{';
        } else if (c == ']') {
            return '[';
        } else {
            return '<';
        }
    }
}
