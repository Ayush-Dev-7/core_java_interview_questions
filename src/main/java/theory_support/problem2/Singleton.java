package theory_support.problem2;

//    Singleton design pattern allows only 1 instance of a class to be created.
public class Singleton {
    private static Singleton instance;

//        Private Constructor prevents instantiation from outside
    private Singleton() {
        System.out.println("Constructor called !");
    }

//        Global access point
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
