package theory_support.problem5.sealed;

public sealed class Vehicle permits Car, Truck {

//    Allows Car and Truck classes to extend vehicle and denies all other classes
//    Extending classes must be one of type sealed, non-sealed or final
    public void run() {
        System.out.println("Vehicle is running");
    }
}
