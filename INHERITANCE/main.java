package Inheritance;

public class main {

    public static void main(String[] args) {

        car c = new Sedan(
                300,
                "Audi",
                "2020",
                3000000,
                "yes",
                "yes",
                "no"
        );

        c.topspeed(60);
    }
}
