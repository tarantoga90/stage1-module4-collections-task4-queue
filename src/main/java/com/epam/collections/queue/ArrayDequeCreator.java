package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> resultQueue = new ArrayDeque<>(firstQueue.size() + secondQueue.size());

        resultQueue.offerLast(firstQueue.poll());
        resultQueue.offerLast(firstQueue.poll());
        resultQueue.offerLast(secondQueue.poll());
        resultQueue.offerLast(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {

            firstQueue.offer(resultQueue.pollLast());

            if (!firstQueue.isEmpty()) {
                resultQueue.offerLast(firstQueue.poll());
            }

            if (!firstQueue.isEmpty()) {
                resultQueue.offerLast(firstQueue.poll());
            }

            secondQueue.offer(resultQueue.pollLast());

            if (!secondQueue.isEmpty()) {
                resultQueue.offerLast(secondQueue.poll());
            }

            if (!secondQueue.isEmpty()) {
                resultQueue.offerLast(secondQueue.poll());
            }

        }

        return resultQueue;
    }
}
