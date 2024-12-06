package StudentManagement;

public class EncapsulatedADTStack {
    class Stack {
        private int[] stackArray; // Internal array to store stack elements
        private int top;         // Index of the top element
        private int capacity;    // Maximum capacity of the stack

        // Constructor to initialize the stack with a fixed size
        public Stack(int capacity) {
            this.capacity = capacity;
            this.stackArray = new int[capacity];
            this.top = -1; // Indicates that the stack is empty
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Method to check if the stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Method to push an element onto the stack
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + data);
                return;
            }
            stackArray[++top] = data; // Increment top and add element
            System.out.println(data + " pushed onto the stack.");
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! No elements to pop.");
                return Integer.MIN_VALUE; // Indicates underflow
            }
            return stackArray[top--]; // Return element and decrement top
        }

        // Method to peek at the top element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. No top element.");
                return Integer.MIN_VALUE; // Indicates no elements
            }
            return stackArray[top];
        }

        // Method to get the current size of the stack
        public int size() {
            return top + 1;
        }
    }

    public class Main {
        public void main(String[] args) {
            // Create a stack with a capacity of 5
            Stack stack = new Stack(5);

            // Test pushing elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);

            // Peek at the top element
            System.out.println("Top element: " + stack.peek());

            // Pop elements from the stack
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());

            // Check if the stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());

            // Push more elements to test overflow
            stack.push(40);
            stack.push(50);
            stack.push(60);
            stack.push(70); // Overflow will occur here

            // Display current size of the stack
            System.out.println("Current stack size: " + stack.size());
        }
    }

}
