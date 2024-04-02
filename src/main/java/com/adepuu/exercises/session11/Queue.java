package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Queue {
    /**
     * Write a Java queue program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java queue program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * <p>
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
     * - Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
     * - Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
     */
    public static void main(String[] args) {
        QueueType queue = new QueueType();
        queue.enqueue(6);
        queue.enqueue(90);
        System.out.println(queue.peek());
        queue.enqueue(60);
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
    }
}

class QueueType {
    LinkedList<Integer> queue;

    public QueueType() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Integer i) {
        this.queue.addLast(i);
    }

    public void dequeue() {
        if (!this.queue.isEmpty()) {
            this.queue.removeFirst();
        } else {
            System.out.println("The queue is currently empty");
        }

    }

    public Integer peek() {
        if (!this.queue.isEmpty()) {
            return this.queue.getFirst();
        } else {
            System.out.println("The queue is currently empty");
            return -1;
        }

    }
}
