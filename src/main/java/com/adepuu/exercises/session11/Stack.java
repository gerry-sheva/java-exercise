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
        StackSheva stack = new StackSheva();
        System.out.println(stack.peek());
        stack.push(5);
        stack.push(55);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }

    private static class StackSheva {
        private Node head;

        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public void push(int i) {
            Node node = new Node(i);
            Node last = head;
            if (head == null) {
                head = node;
            } else {
                while (last.next != null) {
                    last = last.next;
                }
                last.next = node;
            }
        }

        public void pop() {
            Node current = head;
            if (current == null) {
                System.out.println("The stack is empty");
            } else if (current.next == null) {
                head = null;
            } else {
                while (current.next != null) {
                    if (current.next.next == null) {
                        current.next = null;
                        return;
                    }
                    current = current.next;
                }

            }
        }

        public int peek() {
            Node current = head;
            if (current == null) {
                System.out.println("The stack is empty");
                return -1;
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                return current.data;
            }

        }
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
