package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> order = new ArrayList<>(numberOfDishes);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        int i = 1;

        while (!queue.isEmpty()) {
            int dish = queue.poll();
            if (i % everyDishNumberToEat == 0) {
                order.add(dish);
            } else {
                queue.offer(dish);
            }
            i++;
        }
        return order;
    }
}
