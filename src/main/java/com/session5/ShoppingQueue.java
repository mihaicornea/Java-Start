package com.example.session6;

import java.util.LinkedList;
import java.util.Queue;

public class ShoppingQueue {
    /*
    * Create the queue using LinkedList
        Get the first person in the queue and serve them (poll)
        Get the first person in the queue without serving them(peek)
    *
    * */
    public static void main(String[] args) {
        Queue<String> shoppingQueue = new LinkedList<>();
        //Enqueue Alice, Bob and Charlie ot the list (offer)
        shoppingQueue.offer("Alice");
        shoppingQueue.offer("Bob");
        shoppingQueue.offer("Charlie");
        //Print out the initial queue
        System.out.println(shoppingQueue);
        System.out.println(shoppingQueue.poll());
        System.out.println(shoppingQueue);
        System.out.println(shoppingQueue.poll());
        System.out.println(shoppingQueue);
        System.out.println(shoppingQueue.peek());
        System.out.println(shoppingQueue);
        System.out.println(shoppingQueue.poll());


    }
}
