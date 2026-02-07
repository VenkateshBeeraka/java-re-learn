package corejava.constructor;

public class ChildConstructor extends ParentConstructor {

    int x = 0;

    //By default every constructor will call parent constructor with mentioning super class, if the class extended by parent class.
    ChildConstructor(){
        super(); // super will call parent constructor and it must be present first line of the construtor and this is called constructor chaining.
        System.out.println("Default constructor");
    }

    //parameterized constructor
    ChildConstructor(int x){
        this(3, 2); // this will call same class constructor and it must be present first line of the construtor and this is called constructor chaining.
        System.out.println("constructor with parameter "+ x);
    }

    ChildConstructor(int x, int y){
        this.x = x; //this.x is instance varible or local varible and x is object varible to differentaite we have to use this keyword.
        System.out.println("constructor with parameter "+ x +" and "+ y);
    }

    public static void main(String[] args) {
        ChildConstructor ce = new ChildConstructor();
        ChildConstructor ce1 = new ChildConstructor(5);
        ChildConstructor ce2 = new ChildConstructor(5, 5);
    }
    
}
