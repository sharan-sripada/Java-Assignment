package assignment7;

public class InheritClass extends ConcreteClass implements NewInterface {
    @Override
    public void firstMethod1() {
        System.out.println("firstMethod1");
    }

    @Override
    public void firstMethod2() {
        System.out.println("firstMethod2");
    }

    @Override
    public void secondMethod1() {
        System.out.println("secondMethod1");
    }

    @Override
    public void secondMethod2() {
        System.out.println("secondMethod2");
    }

    @Override
    public void thirdMethod1() {
        System.out.println("thirdMethod1");
    }

    @Override
    public void thirdMethod2() {
        System.out.println("thirdMethod2");
    }

    @Override
    public void newMethod() {
        System.out.println("newMethod");
    }
}
