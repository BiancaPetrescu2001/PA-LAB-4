package optional;

import java.util.*;

public class Problem {
    private LinkedList<Student> listOfStudents = new LinkedList<Student>();
    private TreeSet<School> listOfSchools = new TreeSet<>();
    private Map<Student, List<School>> studentsPreferences = new HashMap<Student, List<School>>();
    private Map<School, List<Student>> schoolsPreferences = new HashMap<School, List<Student>>();

    public Problem(LinkedList<Student> listOfStudents, TreeSet<School> listOfSchools, Map<Student, List<School>> studentsPreferences, Map<School, List<Student>> schoolsPreferences) {
        this.listOfStudents = listOfStudents;
        this.listOfSchools = listOfSchools;
        this.studentsPreferences = studentsPreferences;
        this.schoolsPreferences = schoolsPreferences;
    }

    public Problem() {
    }

    public LinkedList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(LinkedList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public TreeSet<School> getListOfSchools() {
        return listOfSchools;
    }

    public void setListOfSchools(TreeSet<School> listOfSchools) {
        this.listOfSchools = listOfSchools;
    }

    public Map<Student, List<School>> getStudentsPreferences() {
        return studentsPreferences;
    }

    public void setStudentsPreferences(Map<Student, List<School>> studentsPreferences) {
        this.studentsPreferences = studentsPreferences;
    }

    public Map<School, List<Student>> getSchoolsPreferences() {
        return schoolsPreferences;
    }

    public void setSchoolsPreferences(Map<School, List<Student>> schoolsPreferences) {
        this.schoolsPreferences = schoolsPreferences;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "listOfStudents=" + listOfStudents +
                ", listOfSchools=" + listOfSchools +
                ", studentsPreferences=" + studentsPreferences +
                ", schoolsPreferences=" + schoolsPreferences +
                '}';
    }
}
