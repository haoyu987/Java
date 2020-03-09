package hw;

/**
 * Machinery
 */
public abstract class Machinery {

    Machinery(int capacity, String name){};
    abstract void start();
    abstract void stop();
    abstract void refuel();
    abstract void fix();
    
}