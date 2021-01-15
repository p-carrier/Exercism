import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private static String word;
    private static Map<String, Integer> scoreCard = createMap();

    private static Map<String, Integer> createMap() {
        Map<String, Integer> card = new HashMap<>();
        card.put("A", 1);
        card.put("E", 1);
        card.put("I", 1);
        card.put("O", 1);
        card.put("U", 1);
        card.put("L", 1);
        card.put("N", 1);
        card.put("R", 1);
        card.put("S", 1);
        card.put("T", 1);
        card.put("D", 2);
        card.put("B", 3);
        card.put("G", 2);
        card.put("C", 3);
        card.put("M", 3);
        card.put("P", 3);
        card.put("F", 4);
        card.put("H", 4);
        card.put("V", 4);
        card.put("W", 4);
        card.put("Y", 4);
        card.put("K", 5);
        card.put("J", 8);
        card.put("X", 8);
        card.put("Q", 10);
        card.put("Z", 10);
//        card.put("AEIOULNRST", 1);
//        card.put("DG", 2);
//        card.put("BCMP", 3);
//        card.put("FHVWY", 4);
//        card.put("K", 5);
//        card.put("JX", 8);
//        card.put("QZ", 10);
        return card;
    }

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        return word.chars()
                .mapToObj(c -> String.valueOf((char) c).toUpperCase())
                .peek(e -> System.out.println(e))
                .map(letter -> scoreCard.get(letter))
                .peek(e -> System.out.println(e))
                .mapToInt(Integer::intValue)
                .sum();
    }

}