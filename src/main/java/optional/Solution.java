package optional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    private Map<Student, School >pairs = new HashMap<Student, School>();

    public Solution(Map<Student, School> pairs) {
        this.pairs = pairs;
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
}
