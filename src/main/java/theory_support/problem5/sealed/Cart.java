package theory_support.problem5.sealed;

public class Cart {
//public class Cart extends Vehicle{
//    can not extend vehicle as it is not `permitted` and will throw compile time error
    public void run() {
        System.out.println("Cart is running");
    }
}
