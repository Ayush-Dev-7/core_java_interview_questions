package theory_support.problem5.patterns;

public class WithoutPattern {

    public static String checkType(Object obj) {
        if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            return "Integer : " + i;
        }
        if (obj instanceof String) {
            String s = (String) obj;
            return "String: " + s;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            return "Double : " + d;
        }
        return "Unknown Type";
    }
}
