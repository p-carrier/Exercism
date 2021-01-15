import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private final static long gigasecond = 1_000_000_000;
    private LocalDateTime date;

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay());
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.date = birthDateTime.plusSeconds(gigasecond);
    }

    LocalDateTime getDateTime() {
        return this.date;
    }

}
