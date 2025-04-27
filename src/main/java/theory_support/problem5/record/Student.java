package theory_support.problem5.record;

import java.util.Objects;

public class Student {

    private final String name;
    private final Integer roleNumber;
    private final Integer standard;

    public Student(String name, Integer roleNumber, Integer standard) {
        this.name = name;
        this.roleNumber = roleNumber;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public Integer getRoleNumber() {
        return roleNumber;
    }

    public Integer getStandard() {
        return standard;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(this.getName(), student.getName())
                && Objects.equals(this.getRoleNumber(), student.getRoleNumber())
                && Objects.equals(this.getStandard(), student.getStandard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRoleNumber(), getStandard());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roleNumber=" + roleNumber +
                ", standard=" + standard +
                '}';
    }
}
