import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Series {

    private final String series;
    private final String OverSize = "Slice size is too big.";
    private final String UnderSize = "Slice size is too small.";

    Series(String series) {
        this.series = series;
    }

    List<String> slices(int size) {
        if(series.length() < size) throw new IllegalArgumentException(OverSize);
        if(size < 1) throw new IllegalArgumentException(UnderSize);

        return IntStream.rangeClosed(0, series.length() - size)
                .mapToObj(i -> series.substring(i, i + size))
                .collect(Collectors.toList());
    }
}
