package CarParking;

public class Sedan implements Car, ForSale {

    int km;

    public int getSpeed() {
        return 110;
    }

    public String getName() {
        return "Sedan";
    }

    public int getAge() {
        return 2;
    }

    public int getKm() {
        return 1500;
    }

    public int sell() {
        System.out.println("For sale at " + 8000);
        return 8000;
    }

}
