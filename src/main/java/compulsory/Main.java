package compulsory;

import java.util.stream.IntStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i)).toArray(Student[]::new);
        School[] schools = IntStream.rangeClosed(0, 2).mapToObj(i -> new School("H" + i)).toArray(School[]::new);
        schools[0].setSchoolCapacity(1);
        schools[1].setSchoolCapacity(2);
        schools[2].setSchoolCapacity(2);

        LinkedList<Student> listOfStudents = new LinkedList<Student>();
        listOfStudents.add(students[0]);
        listOfStudents.addFirst(students[1]);
        listOfStudents.addLast(students[2]);
        listOfStudents.add(2, students[3]);
        LinkedList<Student> listOfStudentsInOrder = new LinkedList<Student>();
        listOfStudents.sort(Comparator.comparing(Student::getNameStudent));
        listOfStudentsInOrder = listOfStudents;
        System.out.println("The list of students in order is: ");
        for (Student s : listOfStudentsInOrder) {
            System.out.print(s.getNameStudent() + " ");
        }
        System.out.println();
        TreeSet<School> treeSetOfSchools = new TreeSet<>();
        treeSetOfSchools.add(schools[2]);
        treeSetOfSchools.add(schools[0]);
        treeSetOfSchools.add(schools[1]);
        Iterator<School> itr = treeSetOfSchools.iterator();
        System.out.println("The list of schools in order is: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        Map<Student, List<School>> studentsPreferences = new TreeMap<Student, List<School>>();
        studentsPreferences.put(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        studentsPreferences.put(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        studentsPreferences.put(students[2], Arrays.asList(schools[0], schools[1]));
        studentsPreferences.put(students[3], Arrays.asList(schools[0], schools[2]));

        Map<School, List<Student>> schoolsPreferences = new HashMap<School, List<Student>>();
        schoolsPreferences.put(schools[0], Arrays.asList(students[3], students[0], students[1], students[2]));
        schoolsPreferences.put(schools[1], Arrays.asList(students[0], students[2], students[1]));
        schoolsPreferences.put(schools[2], Arrays.asList(students[0], students[1], students[3]));
        System.out.println("Student preferences are: ");
        System.out.println(studentsPreferences);
        System.out.println("School preferences are: ");
        System.out.println(schoolsPreferences);
    }
}
