package theory;

import theory_support.problem2.Singleton;
import theory_support.problem2.factory.Feline;
import theory_support.problem2.factory.FelineFactory;

public class _02_PrivateConstructor {
//    Question : Can a constructor be private ?
//    Answer :  Yes
//    Usage : Singleton design pattern, factory pattern, Static utility methods

    public static void main(String[] args) {
        useSingletonPattern();
        System.out.println("==================");
        useFactoryPattern();
    }

    public static void useSingletonPattern() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Are the objects equal : " + singleton1.equals(singleton2));
    }

//    Factory design pattern allows object instantiation & configuration centrally
    private static void useFactoryPattern() {
        Feline cat1 = FelineFactory.getAnimal("Lion");
        cat1.makeSound();

        Feline cat2 = FelineFactory.getAnimal("Tiger");
        cat2.makeSound();
    }

}