package Inheritance;

public abstract class car extends Automobile {

    public car(double topspeed,
               String brandName,
               String yearofManufacture,
               double cost,
               String moonRoof,
               String headlamps,
               String groundClearance) {

        super(topspeed, brandName, yearofManufacture, cost);
    }

    public abstract void topspeed(int speed);
}