package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Stack {
    /**
     * Write a Java stack program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java stack program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic stack operations (push, pop, peek) on a linked list.
     * - Dynamic Scaling: The stack should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for push and pop operations, ensuring efficient data management.
     * - Memory Efficiency: The stack should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to pop an element from an empty stack, and provide clear error messages.
     */
    public static void main(String[] args) {
        StackType stackType = new StackType();
        stackType.pop();
    }
}

class StackType {
    LinkedList<Integer> stack;

    public StackType() {
        this.stack = new LinkedList<>();
    }

    public void push(Integer i) {
        this.stack.addLast(i);
    }

    public void pop() {
        if (!this.stack.isEmpty()) {
            this.stack.removeLast();
        } else {
            System.out.println("Stack is currently empty!");
        }

    }

    public Integer peek() {
        if (!this.stack.isEmpty()) {
            return this.stack.getLast();
        } else {
            System.out.println("Stack is currently empty!");
            return -1;
        }
    }
}
