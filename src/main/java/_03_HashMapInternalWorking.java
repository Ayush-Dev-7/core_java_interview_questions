import java.util.HashMap;

public class _03_HashMapInternalWorking {

//    Question : Explain internal working of HashMap ?
//    Explanation :
//    HashMap<key, value> has underlying data structure as "DYNAMIC ARRAY" of "BUCKETS".
//    Load factor for array is 0.75 and the BUCKETS are initially linked list and if there are a lot of hash collisions
//    then converted to "RED BLACK TREE".
//    Hash collision : Hash value of a key is calculated based on internal hash function which is JVM specific.
//    If hash value of 2 keys are same, it is known as hash collision.

//    Insertion [Complexity : O(log n)]
//    Hash collision resolution :
//        i.  If the keys are same, value associated with older key is overwritten.
//        ii. If the keys are different, the new key value is added as the next node of older key.

//    Random Access [Complexity : O(log n)]
//    i.  Calculate hash and go to bin ,
//    ii. Compare searchKey with 1st node Key using .equals(),
//          a. if result is true,return value of the node
//          b. If false, go to next node & compare.

    public static void main(String[] args) {
        HashMap<String,Integer> student = new HashMap<>(3,2);

        student.put("Ayush",1);
        System.out.println("Ayush".hashCode());

        student.put("Gaurav",2);
        System.out.println("Gaurav".hashCode());

        student.put("Rohit",3);
        System.out.println("Rohit".hashCode());

        System.out.println(student);

        student.put("Rohit",4);
        System.out.println("Aron".hashCode());

        System.out.println(student);
    }
}
