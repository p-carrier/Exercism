class IsbnVerifier {

    private int score(String stringToVerify) {
        try {
            int score = 0;
            int len = 10;
            if(!stringToVerify.matches("\\d{9,10}X?") || stringToVerify.length() != len) throw new Exception();
            for(int i = 0; i < stringToVerify.length(); i++) {
                score += len * (i == 9 && stringToVerify.charAt(i) == 'X' ? 10 :
                        Character.getNumericValue(stringToVerify.charAt(i)));
                len--;
            }
            return score;
        } catch (Exception e) {
            return 2;
        }
    }

    boolean isValid(String stringToVerify) {
        return score(stringToVerify.replaceAll("-", "")) % 11 == 0;
    }

}
