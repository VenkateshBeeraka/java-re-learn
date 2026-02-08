package corejava.oops.abstraction.abstractexample;

// An abstract class is a class that cannot be instantiated and may contain both 
// abstract methods (without body) and concrete methods (with body).
public abstract class Animal {
    
    public abstract void sound();

    public void eat() {
        System.out.println("Animal is eating");
    }
}
