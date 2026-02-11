package corejava.oops.inheritences.composition;

// Car HAS-A Engine - Makes logical sense!
public class CarComposition {

    private Engine engine; // Composition - Car contains Engine

    public CarComposition(){
        this.engine = new Engine(); // Car owns the Engine
    }

    void drive(){
        engine.start();
        System.out.println("Car(Composition) is driving...");
    }

    public static void main(String[] args) {
        CarComposition carComposition = new CarComposition();
        carComposition.drive();
        // ✅ Car and Engine are separate entities
        // Car cannot be treated as Engine
    }
}