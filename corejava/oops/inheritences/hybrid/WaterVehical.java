package corejava.oops.inheritences.hybrid;

public interface WaterVehical extends Vehical{
    void sail();

    default void start(){
        System.out.println("Watervehical cannot drive on lands");
        helper();
        info();
    }

    static void info(){
        System.out.println("It travels with the limited speed based on the wind conditions");
    }

    private void helper(){
        System.out.println("Its only drive in water");
    }
}
