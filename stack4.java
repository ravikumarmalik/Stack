//reverse string using stack
import java.util.*;
public class stack4 {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int index=0;
        while (index <str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result=new StringBuilder("");
        while (!s.isEmpty()){
            char current=s.pop();
            result.append(current);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(reverseString(str));
    }
}
