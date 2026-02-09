package corejava.oops.inheritences.multiple;

public class Duck implements flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck can Fly");
        
    }

    @Override
    public void swim() {
        System.out.println("Duck can Swim");
        
    }
}
