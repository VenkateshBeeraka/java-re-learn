package corejava.oops.inheritences.hybrid;

public class CommonVehical implements WaterVehical, LandVehical {

    @Override
    public void sail() {
        System.out.println("It can sail");
    }

    @Override
    public void drive() {
        System.out.println("It can drive");
    }

    // WaterVehical interface is already handled the start method with the default keyword so no need to override here 
    // @Override
    // public void start() {
    //     System.out.println("vehical is staring...");
    // }
    

    public static void main(String[] args) {
        CommonVehical commonVehical = new CommonVehical();
        commonVehical.start();
        commonVehical.drive();
        commonVehical.sail();
        commonVehical.start();
    }
}
