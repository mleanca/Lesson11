package CarParking;

public interface Car {

    int getSpeed();
    String getName();
    int getAge();

    default String printDefaultInfo() {
        return "Default info";
    }
    static void printDefault() {
        System.out.println("Printing default..");
    }

}
