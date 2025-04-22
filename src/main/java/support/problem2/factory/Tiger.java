package support.problem2.factory;

public class Tiger implements Feline{

//        Private Constructor prevents instantiation from outside
    private Tiger(){
        System.out.println("Tiger Constructor");
    }

    @Override
    public void makeSound() {
        System.out.println("Purr");
    }

//    access point
    public static Tiger create(){
        return new Tiger();
    }
}
