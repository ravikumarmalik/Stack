import java.util.Stack;

public class stack5 {
    public static void reverseStack(Stack<Integer> S){
        if (S.isEmpty()){
            return;
        }
        int top=S.pop();//uper jate jate top ko nikalna hai
        reverseStack(S);
        pushAtBottom(S,top);
    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //3,2,1
        reverseStack(s);
        printStack(s);
        //1,2,3

    }
}
