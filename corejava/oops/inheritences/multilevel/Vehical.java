package corejava.oops.inheritences.multilevel;

public class Vehical {
    private String brand;

    public Vehical(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void start(){
        System.out.println("Brand : " + brand);
        System.out.println("Vehical is starting");
    }
}
