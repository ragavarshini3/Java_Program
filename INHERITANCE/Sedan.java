package Inheritance;

public class Sedan extends car {

    public Sedan(double topspeed,
                 String brandName,
                 String yearofManufacture,
                 double cost,
                 String moonRoof,
                 String headlamps,
                 String groundClearance) {

        super(topspeed, brandName,
              yearofManufacture,
              cost,
              moonRoof,
              headlamps,
              groundClearance);
    }

    @Override
    public void topspeed(int speed) {
        System.out.println("Speed = " + speed);
    }
}