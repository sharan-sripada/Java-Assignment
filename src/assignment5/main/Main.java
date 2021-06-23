package assignment5.main;
import assignment5.data.Data;
import assignment5.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data=new Data();
        data.printGlobalVariables();
        data.printLocalVariables();
        Singleton singleton=Singleton.initialize("string");
        //initialize is a static method. Cannot return object through static method
        singleton.printString();

    }
}
