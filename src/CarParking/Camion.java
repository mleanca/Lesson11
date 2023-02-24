package CarParking;

public class Camion implements Car, ForSale {
    int km;

    public int getSpeed() {
        return 90;
    }

    public String getName() {
        return "Camion";
    }

    public int getAge() {
        return 6;
    }

    public int getKm() {
        return 2000;
    }

    public int sell() {
        System.out.println("For sale at " + 20000);
        return 20000;
    }

}
