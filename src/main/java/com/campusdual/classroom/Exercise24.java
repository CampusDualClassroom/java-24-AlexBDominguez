package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("Smith");
        queue1.offer("Montessori");
        queue1.offer("Peralta");
        queue1.offer("House");

        return queue1;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while(!queue.isEmpty()){
            String elemento = queue.poll();
            System.out.println(elemento);
        }

    }

    public static void main(String[] args) {
        Queue<String> queue = createQueue();
        printAndEmptyQueue(queue);
    }

}
