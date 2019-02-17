package com.preparation.designpatterns.singleton;

/**
 * This code initializes the instance on the first calling of getInstance(), and importantly doesn't need synchronization because of the contract of the class loader:
 The class loader loads classes when they are first accessed (in this case Holder's only access is within the getInstance() method)
 when a class is loaded, and before anyone can use it, all static initializers are guaranteed to be executed (that's when Holder's static block fires)
 the class loader has its own synchronization built right in that make the above two points guaranteed to be threadsafe
 */
public class InitializationOnDemand {
    private static class Holder {
        static final InitializationOnDemand INSTANCE = new InitializationOnDemand();
    }

    public static InitializationOnDemand getInstance() {
        return Holder.INSTANCE;
    }
}
