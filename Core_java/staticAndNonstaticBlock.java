package Core_java;

public class staticAndNonstaticBlock {

    static{
        System.out.println("Static block excuted during class loading and before main method");
    }

    {
        System.out.println("Non static block executed after the every object creation and before the constructer execute");
    }

    staticAndNonstaticBlock(){
        System.out.println("Constructor............");
    }
    public static void main(String[] args) {
        System.out.println("Main method started....");
        staticAndNonstaticBlock static1 = new staticAndNonstaticBlock();
        staticAndNonstaticBlock static2 = new staticAndNonstaticBlock();
    }
    
}
