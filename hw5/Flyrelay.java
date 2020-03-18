/**
 * Flyrelay
 */

public class Flyrelay {

    public static void main(String[] args) {
        int totalDistance = 100;
        Bee bie = new Bee(10, "bee");
        Bird dee = new Bird(25, "bird");
        Plane plane = new Plane(20, 50, "plane");
        Airship airship = new Airship(15, 40, "airship");
        Flyable flyer, flyers[] = {bie, dee, plane, airship};
        int thisRound = 0, distanceLeft = totalDistance;

        while(distanceLeft > 0)
        {
            thisRound = 0;
            flyer = getThisTurnFlyer(flyers);
            
            if(flyer.takeoff())
            {
                thisRound = getRandomInt(distanceLeft - 1);
                thisRound += 1;
                thisRound = flyer.flyForSomeDistance(thisRound);

                flyer.land();
            }
            else
            {
                if(flyer instanceof Animal)
                {
                    Animal animalFlyer = (Animal)flyer;
                    System.out.println(animalFlyer.getName() +  " is hungry.");
                    animalFlyer.feed(getRandomInt(20));
                }
                else
                {
                    Machinery machineryFlyer = (Machinery)flyer;
                    System.out.println(machineryFlyer.getName() + " is out of fuel.");
                    machineryFlyer.refuel(20, "gasoline");
                }
            }

            distanceLeft -= thisRound;
            System.out.println("This round traveled " + thisRound + ". " + distanceLeft + " left.");
        }

        System.out.println("Flying relay completed!");
    }

    // get a random integer within the range [0, limitMax]
    private static int getRandomInt(int limitMax) {
        return (int)(Math.random()*limitMax);
    }

    // get the flyer for this round
    private static Flyable getThisTurnFlyer(Flyable[] flyers) {
        int numPlayer = flyers.length;
        return flyers[getRandomInt(numPlayer)];
    }
}