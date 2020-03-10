package hw;

/**
 * Plane
 */
public class Plane extends Machinery implements Flyable {

    Plane(int capacity, int lifespan, String name){
        super(capacity, lifespan, name);
    };
}