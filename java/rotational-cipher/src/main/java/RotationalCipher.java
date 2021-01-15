class RotationalCipher {

    private final int shiftKey;

    RotationalCipher(int shiftKey) {
        if(shiftKey < 0 || shiftKey > 26) throw new Error("ShiftKey must be an integer between 0 and 26");
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder ans = new StringBuilder();
        for (char letter : data.toCharArray()){
            if(Character.isAlphabetic(letter)){
                ans.append(shiftLetter(letter));
            } else {
                ans.append(letter);
            }
        }
        return ans.toString();
    }

    char shiftLetter(char letter) {
        char newLetter = (char) (letter + shiftKey);
        if(!Character.isAlphabetic(newLetter) ||
            (Character.isLowerCase(newLetter) != Character.isLowerCase(letter))) {
            newLetter -= 26;
        }
        return newLetter;
    }
}
