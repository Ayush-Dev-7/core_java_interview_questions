package theory_support.problem5.record;

import java.util.ArrayList;

public class ShowStudents {

    public static void compareStudent() {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ayush", 1, 12));
        studentList.add(new Student("Ayush", 1, 12));
        studentList.add(new Student("Piyush", 2, 10));

        System.out.println("Before overriding toString()");
        for (Student student : studentList) {
            String defaultReference = student.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(student));
            System.out.println(defaultReference);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("After overriding toString()");
        for (Student student : studentList) {
            System.out.println("Student : " + student);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Comparing first 2 list elements which are equal in field values : ");

//        Output
//        1. Before overriding equals() & hashCode() : FALSE as it compares references
//        2. After overriding equals() & hashCode() : TRUE as it compares references
        System.out.println(studentList.get(0).equals(studentList.get(1)));

        System.out.println("========================================================");
        ArrayList<Student2> studentList2 = new ArrayList<>();
        studentList2.add(new Student2("Ayush", 1, 12));
        studentList2.add(new Student2("Ayush", 1, 12));
        studentList2.add(new Student2("Piyush", 2, 10));

        System.out.print("With record class : ");
        System.out.println(studentList2.get(0).equals(studentList2.get(1)));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//        Auto-generated getters
        System.out.println(studentList2.getFirst().name());
        System.out.println(studentList2.getFirst().roleNumber());
        System.out.println(studentList2.getFirst().standard());

//        Auto-generated toString() method
        System.out.println(studentList2.getLast());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ArrayList<Student3> studentList3 = new ArrayList<>();
        try {
            studentList3.add(new Student3(11, "Derek", "Drank"));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            studentList3.add(new Student3(1001, "A", "mann"));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        studentList3.add(new Student3(1001, "Adam", "Sandler"));
//        Auto-generated toString()
        System.out.println(studentList3.getFirst());
//        accessing INSTANCE methods
        studentList3.getFirst().getFullName();
//        accessing STATIC methods
        System.out.println("Employee token : " + Student3.generateEmployeeToken());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        studentList3.add(new Student3(1002, "Alex"));
//        Auto-generated toString()
        System.out.println(studentList3.getLast());
//        accessing INSTANCE methods
        studentList3.getLast().getFullName();
//        accessing STATIC methods
        System.out.println("Employee token : " + Student3.generateEmployeeToken());
    }
}
