# Stack

It's a linear data structure that is based on Last-in-First-out (LIFO) principle. Imagine a deck of cards or a stack of books in a box. The book that you put in the stack first is at the bottom, and the first we will take out of the box is the book that was at the top - that is, the one that got into the box last. 

# What is the Stack data structure for?
One of the most important uses of the stack is to organize subroutine calls. The call point on the stack stores the return address from the subroutine after it terminates (and possibly the parameters passed). With each nested (including recursive) call of subroutines, new return addresses are added to the stack. With each return operation from the subroutine (return), the return address is removed from the stack and control is transferred to it. This application is so important to programming that in most processors the return stack is implemented in hardware in the instruction set. However, in other cases, the stack has to be modeled on more general data structures.

# Java Stack Class of Collection Framework
In Java Stack Class is a class from the Collection framework that implements List interface and extends Vector class. It also implements interfaces Collection, Iterable, Cloneable, Serializable. As you’ve probably already guessed this class represents the LIFO stack of objects. 

# Here is the call to the constructor of the Stack class, that is, the creation of an object of this class.

# Stack<E> stack = new Stack<E>();

Where E is the type of Object.

# Java Stack Methods
This class has only one default constructor and all the methods of the Vector class. Plus, Stack has its own 5 methods:
boolean empty() the method checks if the stack is empty or not. Returns true if stack is empty, false if not.

Object peek() the method returns the element that is at the top of the stack.

Object pop() the method returns the element that is at the top of the stack and removes it.

Object push(Object element) the method adds the specified element to the top of the stack.

int search(Object element) the method searches the stack for the specified element. If the required element is found, its “distance” from the top (serial number) is returned. If the element is not found, -1 is returned.

# Stack code example

Let’s create a program example that works such as the gif picture above. We’ll put three “balls”, orange, purple and green, on the stack. Let's check the stack for emptiness. Then, we will extract balls from the stack until the stack is empty.

# Program
import java.util.Stack;

public class myStackTest2 {

       public static void main(String[] args)
       {

           Stack myStack= new Stack<>();

           System.out.println("Is my stack empty? " + myStack.empty());
// pushing elements into stack
           myStack.push("Orange Ball");
           myStack.push("Violet Ball");
           myStack.push("Green Ball");

//prints elements of the stack
           System.out.println("Elements in Stack: " + myStack);
           System.out.println("Is my stack empty? " + myStack.empty());
           while (!myStack.isEmpty()) {
               myStack.pop();
               System.out.println("Elements in Stack: " + myStack);
               System.out.println("Is my stack empty? " + myStack.empty());
           }
       }
   }

Here is the output of this program: 

Is my stack empty? true
Elements in Stack: [Orange Ball, Violet Ball, Green Ball]
Is my stack empty? false
Elements in Stack: [Orange Ball, Violet Ball]
Is my stack empty? false
Elements in Stack: [Orange Ball]
Is my stack empty? false
Elements in Stack: []
Is my stack empty? true

Since Stack is inherited from Vector Class and implements the List interface, Stack, in addition to the classic push and pop operations for this data structure for adding and extracting elements, also has standard for list structure add() and remove() operations. In our example, adding elements can be implemented in the same way using the add() method. However you can extract using remove() only with an element specified, which makes no sense for the stack data structure.

# Program
import java.util.Stack;

public class myStackTest2 {

       public static void main(String[] args)
       {

           Stack myStack= new Stack<>();

           System.out.println("Is my stack empty? " + myStack.empty());
// pushing elements into stack
           myStack.add("Orange Ball");
           myStack.add("Violet Ball");
           myStack.add("Green Ball");

//prints elements of the stack
           System.out.println("Elements in Stack: " + myStack);
           System.out.println("Is my stack empty? " + myStack.empty());
           while (!myStack.isEmpty()) {
               myStack.pop();
               System.out.println("Elements in Stack: " + myStack);
               System.out.println("Is my stack empty? " + myStack.empty());
           }
       }
   }

The result of the program work, of course, will be exactly the same.

# What about your own Stack implementation? 
You can create your own stack data structure in Java using arrays or linked list classes. In the first case, a continuous array of cells is allocated to store values ​​in memory, which are used as needed. In the second, for each element of the stack, a block of memory is ordered, sufficient to store the value and references to the previous and next elements of the stack. The array-based implementation is simpler, more efficient, and more memory efficient, but it requires a prior knowledge of the stack size limit and can lead to hard-to-find bugs. The list-based implementation is more robust but less efficient. Let's make a simple array-based implementation of the stack. It will include functions.

push — a method that will ensure the addition of an element (in the top position)

pop — a method that will provide the removal of an element (from the top position)

readTop — a method that will return the value of the element that is in position top

sEmpty — a method that will check the stack for emptiness

isFull — a method that will check if our array in which we store the stack is not full

# Program

import java.util.Arrays;

public class MyStack {

   private int maxSize;
   private String[] stackArray;
   private int top;

   public MyStack(int size) {
       this.maxSize = size;
       stackArray = new String[maxSize];
       top = -1;
   }

   public String push (String element) {
       return stackArray[++top] = element;

   }

   public String pop (String element) {

       if (isEmpty())
       {
           System.out.println("Underflow\nProgram Terminated");
           System.exit(-1);
       }

       System.out.println("Removing " + readTop());

       return stackArray[top--];

   }

   public String readTop() {
       return stackArray[top];

   }

   public boolean isEmpty() {
       return (top ==  -1);
   }

   public boolean isFull() {
       return (top == maxSize - 1);
   }

   public void printStack(){
       System.out.println(Arrays.toString(stackArray));
   }
}

Now let's implement an example with three balls based on our stack:

public class myStackTest {
   public static void main(String[] args) {
       MyStack  myStack = new MyStack(3);
       System.out.println("Is my stack empty? " + myStack.isEmpty());

       myStack.push("Orange Ball");
       myStack.push("Violet Ball");
       myStack.push("Green Ball");

      myStack.printStack();

       System.out.println("Is my stack empty? " + myStack.isEmpty());
       while (!myStack.isEmpty()) {
           myStack.pop(myStack.readTop());
           System.out.println("Is my stack empty? " + myStack.isEmpty());
       }
   }

}

The output is here: 

Is my stack empty? true
[Orange Ball, Violet Ball, Green Ball]
Is my stack empty? false
Removing Green Ball
Is my stack empty? false
Removing Violet Ball
Is my stack empty? false
Removing Orange Ball
Is my stack empty? true

If you look closely, the top variable actually contains the index of the last element, and the reference to the object remains in the array. So this implementation needs some improvement. Think about the easiest way to do this.
Should we use Java Stack?
In fact, the Java Stack, like its Vector parent, is a legacy class. Instead, the ArrayList class is usually used. ArrayList is not synchronized while Vector is synchronized. That means with Vector only one thread at a time can access the code, while ArrayList can work with multiple threads. Also, ArrayList is more efficient and faster. So you will most likely see this class only in legacy code. But the Stack data structure is used in programming very often.
