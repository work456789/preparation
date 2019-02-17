package com.preparation.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer2 {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;

        Thread producer = new Thread(new Producer2(buffer, maxSize));
        Thread consumer = new Thread(new Consumer2(buffer, maxSize));
        Thread producer2 = new Thread(new Producer2(buffer, maxSize));
        Thread producer3 = new Thread(new Producer2(buffer, maxSize));
        Thread producer4 = new Thread(new Producer2(buffer, maxSize));


        producer.start();
        producer2.start();
        producer3.start();
        producer4.start();
        consumer.start();
    }

}

class Producer2 implements Runnable {
    private Queue<Integer> buffer;
    private int maxSize;

    public Producer2(Queue<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (buffer) {
                while (buffer.size() == maxSize) {
                    System.out.println("Buffer is full. Waiting for Consumer to consume value");
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value: " + i);
                buffer.add(i);
                buffer.notify();
            }
        }
    }
}

class Consumer2 implements Runnable {
    private Queue<Integer> buffer;
    private int maxSize;

    public Consumer2(Queue<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    System.out.println("Waiting for Producer to produce value");
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Consuming value: " + buffer.remove());
                buffer.notify();
            }
        }
    }
}
