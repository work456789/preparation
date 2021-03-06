package com.preparation.multithreading;

import java.util.HashMap;
import java.util.Queue;
import java.util.Random;

//http://javarevisited.blogspot.bg/2015/07/how-to-use-wait-notify-and-notifyall-in.html
public class ProducerConsumer {
    public static void main(String[] args) {
        HashMap<String, Test> map = new HashMap<>();
        Test t = new Test();
        t.a = 5;
        String key = "key";
        map.put(key, t);
        t = new Test();
        t.a = 6;
        System.out.println(map.get(key).a);

//        Queue<Integer> buffer = new LinkedList<>();
//        int maxSize = 10;
//
//        Producer producer = new Producer(buffer, maxSize, "PRODUCER");
//        Consumer consumer = new Consumer(buffer, maxSize, "CONSUMER");
//
//        producer.start();
//        consumer.start();
    }
}

    class Test {
        public int a;
    }

    class Producer extends Thread {
        private Queue<Integer> queue;
        private int maxSize;

        public Producer(Queue<Integer> queue, int maxSize, String name) {
            super(name);
            this.queue = queue;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == maxSize) {
                        try {
                            System.out.println("Queue is full, " + "Producer thread waiting for " + "consumer to take something from queue");
                            queue.wait();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    Random random = new Random();
                    int i = random.nextInt();
                    System.out.println("Producing value: " + i);
                    queue.add(i);
                    queue.notify();
                }
            }
        }
    }

    class Consumer extends Thread {
        private Queue<Integer> queue;
        private int maxSize;

        public Consumer(Queue<Integer> queue, int maxSize, String name){ super(name); this.queue = queue; this.maxSize = maxSize; }

        @Override
        public void run() {
            while(true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        System.out.println("Queue is empty, " + "Consumer thread is waiting" + " for producer thread to put something");
                        try {
                            queue.wait();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    System.out.println("Consuming value: " + queue.remove());
                    queue.notify();
                }
            }
        }
    }
