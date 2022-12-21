import java.util.Comparator;
import java.util.Objects;

public class FullNameComparator implements Comparator<Student>{

      @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }

}
