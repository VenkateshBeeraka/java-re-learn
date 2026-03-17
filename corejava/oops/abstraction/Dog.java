package corejava.oops.abstraction;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks
        dog.eat();   // Output: Animal is eating
    }
}
