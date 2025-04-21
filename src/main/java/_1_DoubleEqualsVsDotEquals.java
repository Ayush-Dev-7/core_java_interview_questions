public class _1_DoubleEqualsVsDotEquals {
//    Question : Explain the difference between "==" and ".equals()" method

    public static void main(String[] args) {
//======================================================================================================================
        int int1 = 1;
        int int2 = 1;

        // Output: true
        // Explanation : "==" checks equality of value for primitive data types
        System.out.println("Primitive comparison : " + (int1 == int2));
//======================================================================================================================
        String str1 = "Ayush";
        String str2 = "Ayush";

        // Output:true
        // Explanation : Although "==" checks equality of reference for Objects, due to the procedure of
        // "INTERNING"in String literals
        // [Interning : for literals, the value is placed is STRING CONSTANT POOL which is a special area in HEAP
        // and if a new literal is created for which the value already exists in SCP, reference to the existing
        // literal is returned instead of creating new literal]
        System.out.println("Literal comparison : " + (str1 == str2));
//======================================================================================================================
        String str3 = new String("Ayush");
        String str4 = new String("Ayush");

        // Output:false
        // Explanation : "==" checks equality of reference for Objects
        System.out.println("Object comparison : " + (str3 == str4));
//======================================================================================================================
        // Output:true
        // Explanation : ".equal()" checks equality of value for Objects
        System.out.println(".equals() comparison : " + str3.equals(str4));
//======================================================================================================================
        Dog dog1 = new Dog("Sheru", "local");
        Dog dog2 = new Dog("Sheru", "local");
        // Output:false
        // Explanation : ".equal()" checks equality of value for Objects but since we have defined custom class,
        // comparison logic becomes ambiguous and we need to override the "equals()" method to create a custom
        // comparison logic
        System.out.println("Dog class .equals() comparison : " + dog1.equals(dog2));
        // Output: JVM dependent number
        System.out.println("Dog HasCode : " + dog1.hashCode());
//======================================================================================================================
        Cat cat1 = new Cat("Rosy", "local", 5);
        Cat cat2 = new Cat("Rosy", "local", 3);
        // Output:true
        // Explanation : ".equal()" checks equality and we have overridden the "equals()" method to create a custom
        // comparison logic
        System.out.println("Cat class .equals() comparison : " + cat1.equals(cat2));
        // Output: 5
        System.out.println("Cat HasCode : " + cat1.hashCode());

    }

    private static class Dog {
        private String name;
        private String breed;

        Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
    }

    private static class Cat {
        private String name;
        private String breed;
        private int age;

        Cat(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
//            Check if objects references are equal then early return
            if (this == obj) {
                return true;
            }
//            Null Checks and Casting compatibility check
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
//            Cast the argument for compatibility
            Cat cat = (Cat) obj;
//            Custom equality logic to determine equality of 2 objects
            return cat.name.equals(this.name) && cat.breed.equals(this.breed);
        }

//        We need to override the hashcode() as well to maintain contract [simple classes might work without it
//        but hash based collections will fail/generate unexpected output ]
        @Override
        public int hashCode() {
            return this.age;
        }
    }
}
