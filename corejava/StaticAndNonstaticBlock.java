package corejava;

public class StaticAndNonstaticBlock {

    static{
        System.out.println("Static block excuted during class loading and before main method");
    }

    {
        System.out.println("Non static block executed after the every object creation and before the constructer execute");
    }

    StaticAndNonstaticBlock(){
        System.out.println("Constructor............");
    }
    public static void main(String[] args) {
        System.out.println("Main method started....");
        StaticAndNonstaticBlock static1 = new StaticAndNonstaticBlock();
        StaticAndNonstaticBlock static2 = new StaticAndNonstaticBlock();
    }
    
}
