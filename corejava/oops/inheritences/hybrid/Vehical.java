package corejava.oops.inheritences.hybrid;

public interface Vehical {
    
    void start();
    
    default void sail(){
        System.out.println("default for sail method");
    }
}
