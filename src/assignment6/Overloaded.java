package assignment6;

public class Overloaded {
    Overloaded(){
        this(2);//Calling parameterized constructor

    }
    Overloaded(int x){
        System.out.println(x+" parameterized constructor called");
    }
}
