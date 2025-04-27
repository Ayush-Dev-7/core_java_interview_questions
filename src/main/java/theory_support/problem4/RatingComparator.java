package theory_support.problem4;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie1> {
    @Override
    public int compare(Movie1 o1, Movie1 o2) {
        return o2.getRating().compareTo(o1.getRating());
    }
}
