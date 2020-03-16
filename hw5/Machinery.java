package hw5;

/**
 * Machinery
 */
public class Machinery {
    private String name;
    private int capacity;
    private int currentFuel;
    private boolean isGood = true;
    private int maxLifespan;
    private int currentLifespan;

    Machinery(int capacity, int lifeSpan, String name) {
        this.name = name;
        this.capacity = capacity;
        this.currentFuel = capacity;
        this.maxLifespan = lifeSpan;
        this.currentLifespan = lifeSpan;
    };

    public void start() {
        System.out.println(getName() + " start.");
    };

    public void stop() {
        System.out.println(getName() + " stop.");
    };

    public void refuel(int fuelVolumn, String Fuel) {
        System.out.println("Supply" + fuelVolumn + " Unit " + Fuel + " to " + getName());
        updateFuel(fuelVolumn);
    };

    public void fix() {
        System.out.println(getName() + " fixed.");
    };

    // setter
    public void updateLife(int consumption) {
        currentLifespan += consumption;

        isGood = true;

        if (currentLifespan >= maxLifespan) {
            currentLifespan = maxLifespan;
        } else if (currentLifespan < 0) {
            currentLifespan = 0;
            isGood = false;
        }
    }

    public int updateFuel(int fuelVolumn) {
        currentFuel += fuelVolumn;
        currentFuel = currentFuel > capacity? capacity : currentFuel;
        currentFuel = currentFuel < 0? 0 : currentFuel;

        return currentFuel;
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
        return isGood;
    }

    public int getLifespan(){
        return currentLifespan;
    }
}
