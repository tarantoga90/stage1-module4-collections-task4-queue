package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        if (firstList.isEmpty() && secondList.isEmpty()) {
            return new PriorityQueue<>();
        }

        PriorityQueue<String> result = new PriorityQueue<>(firstList.size() + secondList.size(),
                Collections.reverseOrder());

        result.addAll(firstList);
        result.addAll(secondList);

        return result;
    }
}
