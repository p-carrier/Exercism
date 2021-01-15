class ReverseString {

    String reverse(String inputString) {
        return inputString.chars()
                .mapToObj(letter -> Character.toString((char) letter))
                .reduce("", (word, letter) -> letter +  word);
    }
  
}