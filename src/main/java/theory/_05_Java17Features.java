package theory;

import theory_support.problem5.patterns.WithPattern;
import theory_support.problem5.patterns.WithoutPattern;
import theory_support.problem5.record.ShowRecords;
import theory_support.problem5.sealed.*;

public class _05_Java17Features {
//    Question : Explain the new features in Java 17
//    Answer : the new features are :
//      1.Sealed classes
//      2.Records (finalised in java 17)
//      3.Patterns comparison for objects

    public static void main(String[] args) {
//        switch => true to test feature
        sealedClasses(false);
        recordClasses(false);
        patternInSwitch(true);
    }

    private static void sealedClasses(Boolean on) {
        if (on) {
            Vehicle v1 = new Vehicle();
            v1.run();
            Vehicle v2 = new Car();
            v2.run();
            Vehicle v3 = new Truck();
            v3.run();
            Vehicle v4 = new Tata407();
            v4.run();
            //        Vehicle v5=new Cart(); not allowed
            Cart v5 = new Cart();
            v5.run();
        }
//Output:
//Vehicle is running
//Car is running
//Truck is running
//Tata407 is running
//Cart is running
    }

    private static void recordClasses(Boolean on) {
        if (on) {
            ShowRecords.show();
        }
    }

    private static void patternInSwitch(Boolean on) {
        if (on) {
            System.out.println("Using old code : ");
            System.out.println(WithoutPattern.checkType("Game"));
            System.out.println(WithoutPattern.checkType(21));
            System.out.println(WithoutPattern.checkType(2.2));
            System.out.println(WithoutPattern.checkType(true));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Using new code with if : ");
            System.out.println(WithPattern.checkTypeWithIf("Game"));
            System.out.println(WithPattern.checkTypeWithIf(21));
            System.out.println(WithPattern.checkTypeWithIf(2.2));
            System.out.println(WithPattern.checkTypeWithIf(true));
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Using new code with switch : ");
            System.out.println(WithPattern.checkTypeWithSwitch("Game"));
            System.out.println(WithPattern.checkTypeWithSwitch(21));
            System.out.println(WithPattern.checkTypeWithSwitch(2.2));
            System.out.println(WithPattern.checkTypeWithSwitch(null));
            System.out.println(WithPattern.checkTypeWithSwitch(true));
        }
    }
//Output:
//Using old code :
//    String: Game
//    Integer : 21
//    Double : 2.2
//    Unknown Type
//+++++++++++++++++++++++++++++++++++++++++++++++++
//    Using new code with if :
//    String: Game
//    Integer : 21
//    Double : 2.2
//    Unknown Type
//+++++++++++++++++++++++++++++++++++++++++++++++++
//    Using new code with switch :
//    String: Game
//    Integer : 21
//    Double : 2.2
//    Null object
//    Unknown Type
}
