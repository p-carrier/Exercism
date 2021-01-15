import java.util.stream.IntStream;

class SumOfMultiples {

    private final int result;

    SumOfMultiples(int number, int[] set) {
        this.result = IntStream.range(1, number)
                .filter(x -> {
                    for (int num : set) {
                        if (num != 0 && x % num == 0) return true;
                    }
                    return false;
                })
                .reduce((x1, x2) -> x1 + x2)
                .orElse(0);
    }

    int getSum() {
        return result;
    }

}
