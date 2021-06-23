package assignment7;
import assignment7.cycleinterface.*;
public class Main {
    public static void method1(Interface1 interface1){
        interface1.firstMethod1();
    }
    public static void method2(Interface2 interface2){
        interface2.secondMethod1();
    }
    public static void method3(Interface3 interface3){
        interface3.thirdMethod1();
    }
    public static void method4(NewInterface newInterface){
        newInterface.newMethod();
    }
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Mouse();
        rodents[1]=new Gerbil();
        rodents[2]=new Hamster();
        for(int i=0;i<3;i++){
            rodents[i].eat();
            rodents[i].run();
            }
        System.out.println("-------------");
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new UniCycle();
        cycles[1]=new BiCycle();
        cycles[2]=new TriCycle();
        for (int i=0;i<3;i++){
           // cycles[i].balance();//Compile time error: method not found in Cycle:
        }
        ((UniCycle)cycles[0]).balance();
        ((BiCycle)cycles[1]).balance();
       // ((TriCycle)cycles[2]).balance();//Compile time error : method not declared in tricycle
        System.out.println("-------------");
        //------------------------------------------------//
        InheritClass inheritClass=new InheritClass();
        method1(inheritClass);
        method2(inheritClass);
        method3(inheritClass);
        method4(inheritClass);
        System.out.println("-------------");
        //--------------------------
        Cycles cyclesInheritance=new Cycles();
        cyclesInheritance.main("");
        System.out.println("-------------");

        SecondClass.SecondInnerClass secondInnerClass=new SecondClass.SecondInnerClass("");

    }
}
