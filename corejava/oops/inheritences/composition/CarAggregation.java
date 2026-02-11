package corejava.oops.inheritences.composition;

// Car HAS-A Engine - Makes logical sense!
public class CarAggregation {
    private String brand;
    private EngineAggregation engineAggregation; // Composition - Car contains Engine

    public CarAggregation(String brand,EngineAggregation engineAggregation) {
        this.brand = brand;
        this.engineAggregation = engineAggregation;  // EngineAggregation created outside, just referenced
    }

    void drive(){
        System.out.println(brand + "Brand car(Aggregation) is driving...");
    }

    public static void main(String[] args) {
        // EngineAggregation exists independently
        EngineAggregation engineAggregation = new EngineAggregation("petrol");

        CarAggregation carAggregation = new CarAggregation("Tata", engineAggregation);
        carAggregation.drive();

        // ✅ carAggregation and EngineAggregation are separate entities
        // carAggregation cannot be treated as Engine
        // Even if CarAggregation is destroyed, EngineAggregation still exists

    }
}