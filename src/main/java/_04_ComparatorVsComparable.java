import support.problem4.UsingComparable;
import support.problem4.UsingComparator;

public class _04_ComparatorVsComparable {

//    Question : Explain internal working of HashMap ?
//    Explanation :

///     | Features          |          Comparable                        |          Comparator                      |
///     | Definition        | defines natural ordering within the class  | It defines external sorting logic.       |
///     | Method            |        compareTo()                         | compare()                                |
///     | Implementation    | It is implemented in the class.            | It is implemented in a separate class.   |
///     | Sorting Criteria  | Natural order sorting                      | Custom sorting                           |
///     | Usage             | It is used for a single sorting order.     | It is used for multiple sorting orders.  |
    public static void main(String[] args) {
        UsingComparable.printSortedList();
        System.out.println("===============================================================");
        UsingComparator.printSortedList();
    }
}

// Output:
//+++++++++++ Before Sorting using comparable ++++++++++
//name='movie 1', year=2013, rating=1.5
//name='movie 2', year=2001, rating=4.7
//name='movie 3', year=2015, rating=3.2
//+++++++++++ After Sorting using comparable +++++++++++
//name='movie 2', year=2001, rating=4.7
//name='movie 1', year=2013, rating=1.5
//name='movie 3', year=2015, rating=3.2
//===============================================================
//+++++++++++ Before Sorting using comparator ++++++++++
//name='movie 1', year=2013, rating=1.5
//name='movie 3', year=2015, rating=3.2
//name='movie 2', year=2001, rating=4.7
//+++++++++++ After Sorting using NameComparator +++++++
//name='movie 1', year=2013, rating=1.5
//name='movie 2', year=2001, rating=4.7
//name='movie 3', year=2015, rating=3.2
//+++++++++++ After Sorting using RatingComparator ++++++
//name='movie 2', year=2001, rating=4.7
//name='movie 3', year=2015, rating=3.2
//name='movie 1', year=2013, rating=1.5