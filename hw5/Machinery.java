package hw;

/**
 * Machinery
 */
public class Machinery {
    private String name;
    private int capacity;
    private int currentFuel;
    private boolean isBroken = false;
    private int maxLifespan;
    private int currentLifespan;

    Machinery(int capacity, int lifeSpan, String name){
        this.name = name;
        this.capacity = capacity;
        this.currentFuel = capacity;
        this.maxLifespan = lifeSpan;
        this.currentLifespan = lifeSpan;
    };

    public void start(){};
    public void stop(){};
    public void refuel(){};
    public void fix(){};
    
    // setter
    public void updateLife(int consumption){
        currentLifespan += consumption;

        isBroken = false;

        if(currentLifespan >= maxLifespan)
        {
            currentLifespan = maxLifespan;
        }
        else if(currentLifespan < 0)
        {
            currentLifespan = 0;
            isBroken = true;
        }
    }

    // getter
    public String getName(){
        return name;
    }

    public int getFuel(){
        return currentFuel;
    }

    public int getCapacity(){
        return capacity;
    }

    public boolean checkFunc(){
        return isBroken;
    }

    public int getLifespan(){
        return currentLifespan;
    }
}
