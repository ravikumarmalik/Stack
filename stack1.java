//stack creating using LinkList.

import java.util.ArrayList;
public class stack1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stackB { //static class
        static Node head=null;

        //isEmpty
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode=new Node(data);
            if (isEmpty()){//check stack empty or not
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args) {
        stackB S = new stackB();
        S.push(1);
        S.push(2);
        S.push(3);

        while (!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}
