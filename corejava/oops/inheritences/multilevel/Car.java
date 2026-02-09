package corejava.oops.inheritences.multilevel;

public class Car extends Vehical {

    private String type;
    
    public Car(String brand, String type){
        super(brand);
        this.type = type;
    }

    public void vehicalInfo(){
        System.out.println("Type : " + type);
        start();
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", "Petrol");
        car.vehicalInfo();
    }
}
