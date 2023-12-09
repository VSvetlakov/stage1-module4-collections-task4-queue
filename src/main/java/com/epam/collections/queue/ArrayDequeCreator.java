package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        takeTwo(deque, firstQueue);

        takeTwo(deque, secondQueue);

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()){
            if (!firstQueue.isEmpty())
                nextTurn(deque, firstQueue);

            if (!secondQueue.isEmpty())
                nextTurn(deque, secondQueue);
        }

        return deque;
    }

    public void nextTurn(ArrayDeque<Integer> deque, Queue<Integer> queue){
        queue.add(deque.pollLast());
        for (int i = 0; i < 2; i++) {
            if(!queue.isEmpty()) {
                deque.add(queue.poll());
            }
        }
    }

    public void takeTwo(ArrayDeque<Integer> deque, Queue<Integer> queue){
        for (int i = 0; i < 2; i++) {
            deque.add(queue.poll());
        }
    }
}
