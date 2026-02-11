package corejava.oops.inheritences.composition;

// Problem: Car inherits ALL Engine methods
// Car can be treated as Engine, which is illogical
public class CarInheritance extends Engine {
    
    void drive(){
        start();
        System.out.println("Car(Inheritance) is driving...");
    }

    public static void main(String[] args) {
        CarInheritance carInheritance = new CarInheritance();
        carInheritance.drive();
    }
}
