package theory_support.problem4;

import java.util.ArrayList;

public class UsingComparator {

    public static void printSortedList() {
        ArrayList<Movie1> movieList = new ArrayList<>();

        movieList.add(new Movie1("movie 1", 2013, 1.5));
        movieList.add(new Movie1("movie 3", 2015, 3.2));
        movieList.add(new Movie1("movie 2", 2001, 4.7));

        System.out.println("+++++++++++ Before Sorting using comparator +++++++++++");
        for (Movie1 movie : movieList) {
            System.out.println(movie);
        }
        movieList.sort(new NameComparator());
        System.out.println("+++++++++++ After Sorting using NameComparator +++++++++++");
        for (Movie1 movie : movieList) {
            System.out.println(movie);
        }

        movieList.sort(new RatingComparator());
        System.out.println("+++++++++++ After Sorting using RatingComparator +++++++++++");
        for (Movie1 movie : movieList) {
            System.out.println(movie);
        }
    }
}
