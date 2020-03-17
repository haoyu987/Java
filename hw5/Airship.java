// package hw5;

/**
 * Airship
 */
public class Airship extends Machinery implements Flyable {
    
    Airship(int capacity, int lifespan, String name){
        super(capacity, lifespan, name);
    };

    @Override
    public boolean takeoff(){
        // implements interface Flyable
        if(checkFunc() == false)
        {
            return false;
        }

		if(getFuel() > 0)
		{
			System.out.println(getName() + " rises.");
			return true;
		}
		else
		{
			stop();
			return false;
		}
    }

    @Override
	public int flyForSomeDistance(int distance) {
		// implements interface Flyable
		System.out.println(getName() + " is floating.");
		int fuelBefore = getFuel();
		int fuelAfter = updateFuel(-distance);
        
        // distance traveled equals to the amount of the fuel consumed.
        int distancdTraveled = fuelBefore - fuelAfter;

        updateLife(distancdTraveled);
        
		return fuelBefore - fuelAfter;
    }
    
    @Override
	public void land() {
		// implements interface Flyable
		System.out.println(getName() + " landing.");
	}
}