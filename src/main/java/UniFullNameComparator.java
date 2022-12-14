import java.util.Comparator;

public class UniFullNameComparator implements Comparator<University> {

    @Override
    public int compare(University o1, University o2) {

        return o1.getFullName().compareTo(o2.getFullName());
    }

}