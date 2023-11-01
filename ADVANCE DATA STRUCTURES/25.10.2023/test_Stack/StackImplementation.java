package test_Stack;




class MyStack {

    final int SIZE = 3;
    int arr[] = new int[SIZE];
    int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == SIZE - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full....");
        } else {
            ++top;
            arr[top] = value;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty....");
        } else {
            top--;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty....");
            return -1; // return default value -1 for the empty stack.
        } else {
            return arr[top];
        }
    }
}

public class StackImplementation {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        System.out.println("10 is pushed");
        stack.push(20);
        System.out.println("20 is pushed");
        stack.push(30);
        System.out.println("30 is pushed");
        stack.pop();
        System.out.println("Top element is popped");
        stack.push(40);
        System.out.println("40 is pushed");
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Peeked element is: " + stack.peek());
    }
}
