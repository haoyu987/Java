package hw;

/**
 * Bee
 */
public class Bee extends Animal implements Flyable{

    Bee(int energy, String name){
        super(energy, name);
    };

    @Override
    public boolean takeoff() {
		// implements interface Flyable
		if(getCurrentEnergy() > 0)
		{
			System.out.println(getName() + " flaps wings.");
			return true;
		}
		else
		{
			rest();
			return false;
		}
    }
    
    @Override
    public int flyForSomeDistance(int distance) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        
    }
}