import java.util.*;
public class stack8 {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //esme opening and closing bracket store hai
            if (ch == '(' || ch == '{' || ch == '[') {//opening case
                s.push(ch);
            } else {
                if (s.isEmpty()) { //closing case
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') //paring form () {} [] 
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="(){}[]";
        System.out.println(isValid(str));
    }
}
