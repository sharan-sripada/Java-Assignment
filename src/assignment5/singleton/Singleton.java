package assignment5.singleton;

public class Singleton {
    String string;
    public static Singleton initialize(String string){
        //this.string=string;
        //return this;
        //cannot return 'this'. You cannot return an object without  instantiation.
        //Non static variables cannot be accessed inside a static method.
    return null;
    }
    public void printString(){
        System.out.println(string);
    }

}
