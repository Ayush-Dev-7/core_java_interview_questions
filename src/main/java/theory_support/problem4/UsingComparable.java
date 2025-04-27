package theory_support.problem4;

import java.util.ArrayList;
import java.util.Collections;

public class UsingComparable {

    public static void printSortedList() {
        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("movie 1", 2013, 1.5));
        movieList.add(new Movie("movie 2", 2001, 4.7));
        movieList.add(new Movie("movie 3", 2015, 3.2));

        System.out.println("+++++++++++ Before Sorting using comparable +++++++++++");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

//        Internally calls class' compareTo() if present
        Collections.sort(movieList);
        System.out.println("+++++++++++ After Sorting using comparable +++++++++++");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
