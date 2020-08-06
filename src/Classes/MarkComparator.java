package Classes;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {

    public MarkComparator(){

    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMark() > o2.getMark()){
            return 1;
        }
        if(o1.getMark() < o2.getMark()){
            return -1;
        }
        return 0;
    }
}
