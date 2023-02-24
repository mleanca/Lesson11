package CarParking;

public class Limousine implements Car, ForSale {
    int km;

    public int getSpeed() {
        return 120;
    }

    public String getName() {
        return "Limousine";
    }

    public int getAge() {
        return 3;
    }

    public int getKm() {
        return 1000;
    }

    public int sell() {
        System.out.println("For sale at " + 20000);
        return 20000;
    }

    public String forHire() {
        return "Limousine for hire!!";
    }

}
