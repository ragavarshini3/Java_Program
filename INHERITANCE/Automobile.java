package Inheritance;

public class Automobile {

    private double topspeed;
    private String brandName;
    private String yearofManufacture;
    private double cost;

    public Automobile(double topspeed,
                      String brandName,
                      String yearofManufacture,
                      double cost) {

        this.topspeed = topspeed;
        this.brandName = brandName;
        this.yearofManufacture = yearofManufacture;
        this.cost = cost;
    }

    public double getTopspeed() {
        return topspeed;
    }
}