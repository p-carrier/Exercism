import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class WordSearcher {

    WordSearcher() {

    }

    Map<String, Optional<WordLocation>> search(Set<String> searchWords, char[][] letters) {
        System.out.println("This ::: " + searchWords);
        for(char[] letter : letters) {
            System.out.println(letter);
            for(char l : letter) {
                System.out.println(l);
            }
        }
        Map<String, Optional<WordLocation>> answer = new HashMap<>();
        answer.put("clojure", Optional.empty());
        return answer;
    }
}
