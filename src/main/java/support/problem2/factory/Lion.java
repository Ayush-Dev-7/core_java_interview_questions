package support.problem2.factory;

public class Lion implements Feline {

//        Private Constructor prevents instantiation from outside
    private Lion() {
        System.out.println("Lion Constructor");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

//    access point
    public static Lion create() {
        return new Lion();
    }
}
