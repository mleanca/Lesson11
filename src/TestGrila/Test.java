package TestGrila;

public class Test {
    public static void main(String[] args) {
        TestGrila obj = new TestGrilaChild();
        //object 'obj' of type 'TestGrilaChild' is created
        //assigns it as object of type TestGrila
        obj.m1("ABC");
        //method with String 'ABC' as argument of the method parameter
        //m1 method in TestGrilaChild overrides m1 method in superclass
        //the first line will be executed,
        //so first line will print Two
        //but the second line calls the m1 method of its parent class using super keyword, using ABC as argument
        //so the second line will print One
    }
} //outputs TWO ONE


