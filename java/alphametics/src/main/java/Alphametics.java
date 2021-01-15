import java.util.LinkedHashMap;

public class Alphametics {

    LinkedHashMap<Character, Integer> values;
    String[] factors;

    Alphametics(String equation) {

        factors = equation.split("[\\W]+");

    }

    LinkedHashMap<Character, Integer> solve() {
        return new LinkedHashMap<>();
    }
}
