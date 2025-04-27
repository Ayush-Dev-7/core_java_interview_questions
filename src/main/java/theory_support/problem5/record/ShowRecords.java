package theory_support.problem5.record;

import java.util.ArrayList;

public class ShowRecords {

    public static void show() {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ayush", 1, 12));
        studentList.add(new Student("Ayush", 1, 12));
        studentList.add(new Student("Piyush", 2, 10));

        System.out.println("Before overriding toString()");
        for (Student student : studentList) {
            String defaultReference = student.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(student));
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
        ArrayList<Employee> employeeList = new ArrayList<>();
        try {
            employeeList.add(new Employee(11, "Derek", "Drank"));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            employeeList.add(new Employee(1001, "A", "mann"));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        employeeList.add(new Employee(1001, "Adam", "Sandler"));
//        Auto-generated toString()
        System.out.println(employeeList.getFirst());
//        accessing INSTANCE methods
        employeeList.getFirst().getFullName();
//        accessing STATIC methods
        System.out.println("Employee token : " + Employee.generateEmployeeToken());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        employeeList.add(new Employee(1002, "Alex"));
//        Auto-generated toString()
        System.out.println(employeeList.getLast());
//        accessing INSTANCE methods
        employeeList.getLast().getFullName();
//        accessing STATIC methods
        System.out.println("Employee token : " + Employee.generateEmployeeToken());
    }
}

//Output:

//Before overriding toString()
//Student@3feba861
//Student@27bc2616
//Student@3941a79c
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//After overriding toString()
//Student : Student{name='Ayush', roleNumber=1, standard=12}
//Student : Student{name='Ayush', roleNumber=1, standard=12}
//Student : Student{name='Piyush', roleNumber=2, standard=10}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Comparing first 2 list elements which are equal in field values : true
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//With record class : true
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Ayush
//1
//12
//Student2[name=Piyush, roleNumber=2, standard=10]
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Employee Id cannot be below 100.
//First name must be 2 characters or more.
//Employee[id=1001, firstName=Adam, lastName=Sandler]
//Adam Sandler
//Employee token : 1
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//Employee[id=1002, firstName=Alex, lastName=null]
//Alex
//Employee token : 2