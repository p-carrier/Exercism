import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sumOf = IntStream.rangeClosed(1, input)
                .reduce((x1, x2) -> x1 + x2)
                .getAsInt();
        return sumOf * sumOf;
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.rangeClosed(1, input)
                .map(num -> num * num)
                .reduce((x1, x2) -> x1 + x2)
                .getAsInt();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
