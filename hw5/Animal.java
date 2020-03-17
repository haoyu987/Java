/**
 * Animal
 */
public class Animal {

    private int energyCapacity;
    private int energy;
    private String name;

    Animal(int energyCapacity, String name){
        this.energyCapacity = energyCapacity;
        this.energy = energyCapacity;
        this.name = name;
    }

    public void rest() {
        System.out.println(name + " rest.");
    }

    // setter
    public void feed(int food){
        if(food <= 0)
        {
            System.out.println("Nothing to eat.");
        }

        if(energy >= energyCapacity)
        {
            System.out.println(name + " is full.");
        }
        else
        {
            System.out.println(name + " eating.");
            energy = energy + food >= energyCapacity? energyCapacity: energy + food;
        }
    }

    // setter
    public int energyConsume(int consumption) {
        energy -= consumption;
        energy = energy >= 0? energy:0;
        
        return energy;
    }

    // getter
    public int getCurrentEnergy(){
        return energy;
    }

    // getter
    public String getName(){
        return name;
    }
}
