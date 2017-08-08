package designpatterns.singleton;

public final class Singleton {
    private static volatile Singleton INSTANCE = null;
    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) { //the first check is because getting a lock is expensive and we want to first make sure there is no INSTANCE created already
            synchronized (Singleton.class) {
                if (INSTANCE == null) { //the second check is in case one thread obtains the lock and another is waiting for it. So after the first creates the INSTANCE, the other will enter the block and should not create another INSTANCE
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
