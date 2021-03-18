package optional;

import java.util.Objects;

public class School implements Comparable<School> {
    private String schoolName;
    private int schoolCapacity;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public School(String schoolName, int schoolCapacity) {
        this.schoolName = schoolName;
        this.schoolCapacity = schoolCapacity;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolCapacity(int schoolCapacity) {
        this.schoolCapacity = schoolCapacity;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getSchoolCapacity() {
        return schoolCapacity;
    }

    /**
     * @param o = another object of type School
     * @return 0: if the 2 objects are equal
     * positive value: if the current object is greater than the other
     * negative value: if the current object is smaller than the other
     */
    @Override
    public int compareTo(School o) {
        return this.schoolName.compareTo(o.getSchoolName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, schoolCapacity);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final School other = (School) obj;
        if ((this.schoolName == null && other.schoolName != null) || (this.schoolName != null && !this.schoolName.equals(other.schoolName))) {
            return false;
        }

        if (this.schoolCapacity != other.schoolCapacity) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + schoolName + '\'' +
                ", capacity=" + schoolCapacity +
                '}';
    }
}
