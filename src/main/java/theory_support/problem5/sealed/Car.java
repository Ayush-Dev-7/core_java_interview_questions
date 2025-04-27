package theory_support.problem5.sealed;

public final class Car extends Vehicle {

//    Car can extend Vehicle but it is final so Car can not be extended
    @Override
    public void run() {
        System.out.println("Car is running");
    }
}
