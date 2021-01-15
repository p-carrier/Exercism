import java.util.List;

public class PythagoreanTriplet {

    private int side1;
    private int side2;
    private int side3;

    private int factor;
    private int targetSum;

    PythagoreanTriplet(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void makeTripletsList() {

    }

    public void withFactorsLessThanOrEqualTo(int factor) {
        this.factor = factor;
    }

    public void thatSumTo(int targetSum) {
        this.targetSum = targetSum;
    }

    public List<PythagoreanTriplet> build() {

    }
}
