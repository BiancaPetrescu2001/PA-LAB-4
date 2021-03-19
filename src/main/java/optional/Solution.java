package optional;

import java.util.*;

public class Solution {
    private Map<Student, School >pairs = new HashMap<Student, School>();

    public Solution(Problem p) {
        pairs = getSolution(p);
    }

    public Solution() {
    }

    public Map<Student, School> getPairs() {
        return pairs;
    }

    public void setPairs(Map<Student, School> pairs) {
        this.pairs = pairs;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "pairs=" + pairs +
                '}';
    }

    /**
     *
     * @param p : an Object of type Problem describing the input
     * the algorithm used focuses on the idea of ranking students in order based, supposing that the input order
     *          is the correct one; the students are assigned to their favourite school in order as long as the
     *          school hasn't reached the maximum capacity
     * @return a pair structured as a Map of a Students and the school he was assigned to
     *
     */
    public Map<Student, School> getSolution(Problem p)
    {
        LinkedList<Student> listAux = new LinkedList<>();
        Map<Student, School >pairs2 = new HashMap<Student, School>();
        listAux=p.getListOfStudents();
        for(Student st : listAux)
        {
            for(School sc : p.getStudentsPreferences().get(st))
            {
                if(sc.getSchoolCapacity()>0)
                {
                    sc.setSchoolCapacity(sc.getSchoolCapacity()-1);
                    pairs2.put(st, sc);
                    break;
                }
            }
        }
        return pairs2;
    }
}
