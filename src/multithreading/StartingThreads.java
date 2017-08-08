package multithreading;

public class StartingThreads {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        Thread simpleThread2 = new Thread(new SimpleThread2());
        simpleThread.start();
        simpleThread2.start();
    }
}

class SimpleThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Starting thread " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SimpleThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Starting thread2 " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}