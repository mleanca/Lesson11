package CarParking;

public class Parcare {

    public static void printDefault (Car car) { //Any Car object as the parameter
        System.out.println("Nume: " + car.getName());
        System.out.println("Varsta: " + car.getAge());
        System.out.println("Speed: " + car.getSpeed());

        System.out.println();
    }

    public static void sellCar(ForSale forSale) { //Any Forsale object as parameter
        forSale.sell();
    }

    public static void main(String[] args) {
        Car sedanAsCar = new Sedan(); //upcasting
        Car limousineAsCar = new Limousine();
        Car camionAsCar = new Camion();

        printDefault(sedanAsCar);
        printDefault(limousineAsCar);
        printDefault(camionAsCar);


        ForSale sedanForSale = new Sedan();

        sellCar(sedanForSale);


        Limousine limousineForHire = (Limousine) limousineAsCar; //downcasting to access method specific to child class
        if (limousineForHire instanceof Limousine) { //checking
            System.out.println(limousineForHire.forHire());
        }
    }

}

//Nume: Sedan
//Varsta: 2
//Speed: 110
//
//Nume: Limousine
//Varsta: 3
//Speed: 120
//
//Nume: Camion
//Varsta: 6
//Speed: 90
//
//For sale at 8000
//Limousine for hire!!
