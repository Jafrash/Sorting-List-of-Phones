import java.util.Comparator;

public class SortByName implements Comparator<Phone> {
    public int compare(Phone p1,Phone p2){
        return p1.name.compareTo(p2.name);
    }
}
