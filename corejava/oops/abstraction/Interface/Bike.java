package corejava.oops.abstraction.Interface;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
    

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        Vehicle.accelerate();
        bike.stop();
        bike.service();
    }
}
