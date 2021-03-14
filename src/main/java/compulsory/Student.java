package compulsory;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String nameStudent;

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nameStudent, student.nameStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStudent);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.nameStudent.compareTo(o.getNameStudent());
    }
}
