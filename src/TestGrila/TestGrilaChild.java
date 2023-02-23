package TestGrila;

public class TestGrilaChild extends TestGrila {
    public void m1(String x) {
        System.out.println("Two");
        super.m1("ABC");
        //since m1 method in TestGrilaChild overrides m1 method in superclass
        //the first line will be executed,
        //so first line will print Two
        //but the second line calls the m1 method of its parent class using super keyword, using ABC as argument
        //so the second line will print One

    }
}
