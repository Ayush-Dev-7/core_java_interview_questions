package support.problem4;

public class Movie1 {

    private final String name;
    private final Integer year;
    private final Double rating;

    public Movie1(String name, Integer year, Double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating;
    }
}
