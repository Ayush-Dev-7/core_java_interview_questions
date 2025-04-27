package theory_support.problem5.patterns;

public class WithPattern {

    public static String checkTypeWithIf(Object obj) {
        if (obj instanceof Integer i) {
            return "Integer : " + i;
        }
        if (obj instanceof String s) {
            return "String: " + s;
        }
        if (obj instanceof Double d) {
            return "Double : " + d;
        }
        return "Unknown Type";
    }

    public static String checkTypeWithSwitch(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer : " + i;
            case String s -> "String: " + s;
            case Double d -> "Double : " + d;
            case null -> "Null object";
            default -> "Unknown Type";
        };
    }
}
