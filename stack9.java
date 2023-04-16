import java.util.Stack;

public class stack9 {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if (ch==')'){
                int count=0;


                //(!s.isEmpty() && s.pop() !='(')
                while (s.peek() !='('){
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;//duplicate exist
                }else{
                    s.pop();//opening pairs
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";//true
        String str2="(a+b)";//false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
