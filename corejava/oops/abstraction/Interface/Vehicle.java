package corejava.oops.abstraction.Interface;

//An interface is a completely abstract blueprint that contains only method signatures (until Java 8).
//Before Java 8: Only abstract methods and Only public static final variables
//After Java 8+: Default methods (with body) and Static methods
//Java 9+: Private methods
public interface Vehicle {

    void start();

    void stop();

    static void accelerate(){
        System.out.println("Vehicle is accelerating");
    }

    default void service(){
        checkFuel();
        System.out.println("Vehicle is being serviced");
    }

    private void checkFuel(){
        System.out.println("Checking fuel level before servicing");
    }
    
}
