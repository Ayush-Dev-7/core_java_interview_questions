package theory_support.problem4;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie1> {

    @Override
    public int compare(Movie1 o1, Movie1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
