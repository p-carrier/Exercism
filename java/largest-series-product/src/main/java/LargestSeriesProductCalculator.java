import java.util.stream.IntStream;

class LargestSeriesProductCalculator {
    private final String inputNumber;
    private final String InvalidLength = "Series length must be less than or equal to the length of the string to search.";
    private final String IllegalLetterInNumber = "String to search may only contain digits.";
    private final String NonNegativeNumberOfDigits = "Series length must be non-negative.";

    LargestSeriesProductCalculator(String inputNumber) {
        if(!inputNumber.matches("\\d*")) throw new IllegalArgumentException(IllegalLetterInNumber);
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits < 0) throw new IllegalArgumentException(NonNegativeNumberOfDigits);
        if(inputNumber.length() < numberOfDigits) throw new IllegalArgumentException(InvalidLength);
        if(numberOfDigits == 0 || inputNumber == "") return 1;

        return IntStream.rangeClosed(0, inputNumber.length() - numberOfDigits)
                .mapToObj(i -> inputNumber.substring(i, i + numberOfDigits))
                .flatMapToInt(num -> IntStream.of(
                        IntStream.range(0, num.length())
                            .map(i -> Character.getNumericValue(num.charAt(i)))
                            .reduce((x1, x2) -> x1 * x2)
                            .getAsInt())
                )
                .max()
                .orElse(1);
    }
}
