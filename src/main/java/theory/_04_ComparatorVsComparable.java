package theory;

import theory_support.problem4.UsingComparable;
import theory_support.problem4.UsingComparator;

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
