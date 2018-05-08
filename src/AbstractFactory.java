import java.util.Map;
import java.util.Optional;

public class AbstractFactory {
    private static Map<String, BaseFactory> colorFactoryMap =
            Map.of("black", new BlackFactory(), "white", new WhiteFactory());

    private AbstractFactory() {

    }

    public static BaseFactory getFactory(String color) {
        return Optional.of(colorFactoryMap.get(color.toLowerCase())).orElseThrow(RuntimeException::new);
    }
}
