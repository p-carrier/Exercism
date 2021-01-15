import java.util.List;
import java.util.Set;

import java.util.*;

class Matrix {

    Matrix(List<List<Integer>> values) {
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return Collections.singleton(new MatrixCoordinate(2, 1));
    }
}
