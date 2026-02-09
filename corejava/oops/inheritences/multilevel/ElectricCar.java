package corejava.oops.inheritences.multilevel;

public class ElectricCar extends Car{
     private int speed;

     public ElectricCar(String brand, String type, int speed){
        super(brand, type);
        this.speed = speed;
     } 

     public void vehicalInfo(){
        System.out.println("Speed : " + speed);
        start();
    }

    public static void main(String[] args) {
        ElectricCar bike = new ElectricCar("TVS", "Electric", 120);
        bike.vehicalInfo();
    }
}
