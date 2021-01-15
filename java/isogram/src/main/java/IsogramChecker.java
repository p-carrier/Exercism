import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        List<String> letters = new ArrayList<String>(phrase.length());
        String lowerPhrase = phrase.toLowerCase();
        for (int i = 0; i < lowerPhrase.length(); i++) {
            if (letters.contains(String.valueOf(lowerPhrase.charAt(i)))
                    && Character.isAlphabetic(lowerPhrase.charAt(i))) {
                return false;
            }
            letters.add(String.valueOf(lowerPhrase.charAt(i)));
        }
        return true;
    }

}
