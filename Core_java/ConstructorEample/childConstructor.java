package Core_java.ConstructorEample;

public class childConstructor extends parentConstructor {

    int x = 0;

    //By default every constructor will call parent constructor with mentioning super class, if the class extended by parent class.
    childConstructor(){
        super(); // super will call parent constructor and it must be present first line of the construtor and this is called constructor chaining.
        System.out.println("Default constructor");
    }

    //parameterized constructor
    childConstructor(int x){
        this(3, 2); // this will call same class constructor and it must be present first line of the construtor and this is called constructor chaining.
        System.out.println("constructor with parameter "+ x);
    }

    childConstructor(int x, int y){
        this.x = x; //this.x is instance varible or local varible and x is object varible to differentaite we have to use this keyword.
        System.out.println("constructor with parameter "+ x +" and "+ y);
    }

    public static void main(String[] args) {
        childConstructor ce = new childConstructor();
        childConstructor ce1 = new childConstructor(5);
        childConstructor ce2 = new childConstructor(5, 5);
    }
    
}
