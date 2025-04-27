package theory_support.problem5.sealed;

public non-sealed class Truck extends Vehicle {

//    Truck can extend Vehicle it can be extended as it non-sealed
    @Override
    public void run() {
        System.out.println("Truck is running");
    }
}
