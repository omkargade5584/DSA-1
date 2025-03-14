package StackUsingArray;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushing elements: " + stack);

        // Popping element from stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Searching for an element in the stack
        System.out.println("Position of 20: " + stack.search(20));
    }
}
