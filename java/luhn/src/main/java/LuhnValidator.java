import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

class LuhnValidator {

    private Boolean onlyNumber (String number) {
        return number.replaceAll("[\\D]", "").length() == number.length();
    }

    private boolean sumCheck (String number) {
        int[] numbers = new int[number.length()];
        int instance = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(number.charAt(i));
            if(instance % 2 != 0) {
                num = num * 2;
                if(num > 9) {
                    num -= 9;
                }
            }
            numbers[instance] = num;
            instance ++;
        }

        return IntStream.of(numbers).sum() % 10 == 0;
    }

    boolean isValid(String candidate) {
        String stripCandidate = candidate.replaceAll(" ", "");
        return stripCandidate.length() > 1 && onlyNumber(stripCandidate) && sumCheck(stripCandidate);
    }

}
