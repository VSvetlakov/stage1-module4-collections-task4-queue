package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> list = new ArrayList<>();

        Queue<Integer> queue = initDisesQueu(numberOfDishes);

        int curNumberDish = 1;

        while (!queue.isEmpty()) {

            int curDish = queue.poll();

            if (curNumberDish % everyDishNumberToEat == 0) {
                list.add(curDish);
            } else {
                queue.add(curDish);
            }

            curNumberDish++;
        }

        return list;
    }

    private Queue<Integer> initDisesQueu(int numberOfDishes){

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        return queue;
    }
}
