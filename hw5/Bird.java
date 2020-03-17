/**
 * Bird
 */
public class Bird extends Animal implements Flyable{

    Bird(int energy, String name){
        super(energy, name);
    }

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
		// implements interface Flyable
		System.out.println(getName() + " is flying");
		int energyBefore = getCurrentEnergy();
		int energyAfter = energyConsume(distance);
		
		return energyBefore - energyAfter;
	}

	@Override
	public void land() {
		// implements interface Flyable
		System.out.println(getName() + " landing.");
	}
}
