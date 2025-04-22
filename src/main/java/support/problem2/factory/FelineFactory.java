package support.problem2.factory;

public final class FelineFactory {

    public static Feline getAnimal(String animal) {
        return switch (animal) {
            case "Lion" -> Lion.create();
            case "Tiger" -> Tiger.create();
            default -> null;
        };
    }
}
