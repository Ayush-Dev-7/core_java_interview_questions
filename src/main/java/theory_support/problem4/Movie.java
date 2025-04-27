package theory_support.problem4;

public class Movie implements Comparable<Movie> {

    private final String name;
    private final Integer year;
    private final Double rating;

    public Movie(String name, Integer year, Double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating;
    }
}
