public class TwoBucket {

    private int moves = 1;
    private final String final_bucket;
    private final int other_bucket;

    TwoBucket(int size1, int size2, int liters, String first_bucket) {
        int bucket1 = first_bucket.equals("one") ? size1 : 0;
        int bucket2 = first_bucket.equals("two") ? size2 : 0;

        while(bucket1 != liters || bucket2 != liters) {

            moves += 1;
        }

        final_bucket = bucket1 == liters ? "one" : "two";
        other_bucket = bucket1 == liters ? bucket2 : bucket1;
    }

    int getTotalMoves() {
        return moves;
    }

    String getFinalBucket() {
        return final_bucket;
    }

    int getOtherBucket() {
        return other_bucket;
    }

}
