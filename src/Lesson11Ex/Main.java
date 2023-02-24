package Lesson11Ex;

public class Main {

    public static void main(String[] args) {
        
        Square square1 = new Square();
        Circle circle1 = new Circle();
//        Shape square2 = new Square(); //incompatible type error, because class Square is not a child of Shape
        Shape circle2 = new Circle();

        System.out.println(square1.render()); //calling virtual method render() for all objects
        System.out.println(circle1.render());

        if (circle2 instanceof Shape) {
            System.out.println(circle2.render()); //upcasting an object of Square as an instance of Shape, virtual method render()
        }

    }
}
