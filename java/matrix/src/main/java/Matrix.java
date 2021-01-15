import java.util.Arrays;
import java.util.stream.IntStream;

class Matrix {

    private int[][] columns;
    private int[][] rows;

    Matrix(String matrixAsString) {
        String[] matrixStringSplit = matrixAsString.split("\n");
        this.rows = Arrays.stream(matrixStringSplit)
                .map(x -> x.split(" "))
                .map(x -> Arrays.stream(x)
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .toArray(int[][]::new);

        int colNum = rows[0].length;
        int rowNum = rows.length;
        this.columns = new int[colNum][rowNum];
        
        IntStream.range(0, rowNum)
            .forEach(x -> IntStream.range(0, colNum)
                .forEach(y -> this.columns[y][x] = this.rows[x][y]));
    }

    int[] getRow(int rowNumber) {
        return rows[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        return columns[columnNumber];
    }
}
