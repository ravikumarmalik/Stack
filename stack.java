 //stack creating using arrayList
import java.util.ArrayList;
public class stack {
     public static class Stack{ //static class
          static ArrayList<Integer> list =new ArrayList<>();//create static array list
         //four operation push,pop,peek,isEmpty

         //isEmpty operation
         public static boolean isEmpty(){
             return list.size()==0;
         }
         //push operation
         public static void push(int data){
             list.add(data);
         }

         //pop operation
         public static int pop(){
             if (isEmpty()){ // corner point
                 return -1;
             }
             int top=list.get(list.size()-1);
             list.remove(list.size()-1);
             return top;
         }

         //peek operation
         public static int peek(){
             if (isEmpty()){ //corner point
                 return -1;
             }
             return list.get(list.size()-1);
         }

    }
    public static void main(String[] args) {
        Stack S=new Stack();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);

        while (!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }
    }
}
