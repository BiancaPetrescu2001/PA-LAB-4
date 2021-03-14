package compulsory;

import java.util.Objects;
import java.util.Comparator;

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
