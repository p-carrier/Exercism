import java.util.Map;
import java.util.stream.Collectors;

public class NucleotideCounter {

    private final Map<Character, Integer> count;

    NucleotideCounter(String strand) {
        this.count = strand.chars()
                .peek(e -> System.out.println(e))
                .mapToObj(c -> (char) c)
                .peek(e -> System.out.println(e))
                .collect(
                        Collectors.groupingBy(nuc -> nuc, Collectors.summingInt(num -> 1))
                )
                ;
    }

    Map<Character, Integer> nucleotideCounts() {
        return count;
    }

}
