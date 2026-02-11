package corejava.oops.inheritences.composition;

public class EngineAggregation {
    private String type;

    public EngineAggregation(String type){
        this.type = type;
    }

    void start(){
        System.out.println("Engine Started");
    }

    void stop(){
        System.out.println("Engine Stopped");
    }
}
