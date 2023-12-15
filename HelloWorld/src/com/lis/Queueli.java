package com.lis;

import java.util.LinkedList;
import java.util.Queue;

public class Queueli {
    public static void main(String[] args) {
        Queue<Integer> h=new LinkedList<>();
        h.offer(2);
        h.offer(4);
        h.offer(6);
        h.add(8);
        System.out.println("Queue:"+h);
        System.out.println("first number:"+h.peek());
        System.out.println("removed number:"+h.poll());
        System.out.println("new queue:"+h);
    }
}
