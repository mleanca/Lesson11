package Lesson11Ex;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square();
        Circle circle1 = new Circle();
        Shape circle2 = new Circle();


//        Shape square2 = new Square(); //incompatible type error,
//        if (square1 instanceof Shape) {
//            square2.render(); //upcasting an object of Square as an instance of Shape, virtual method render()
//        }

        square1.render(); //virtual method render()
        circle1.render(); //virtual method render()

        if (circle2 instanceof Shape) {
            circle2.render(); //upcasting an object of Square as an instance of Shape, virtual method render()
        }

        //OUTPUTS:
        //Rendering a square
        //Rendering a circle
        //Rendering a circle

    }
}
