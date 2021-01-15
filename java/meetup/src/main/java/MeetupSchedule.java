import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

enum MeetupSchedule {
    FIRST,
    SECOND,
    THIRD,
    FOURTH,
    LAST,
    TEENTH
}

class Meetup {

    private final LocalDate date;

    Meetup(int month, int year) {
        this.date = LocalDate.now().with(ChronoField.YEAR, year)
                .with(ChronoField.MONTH_OF_YEAR, month);
    }

    public LocalDate day(DayOfWeek day, MeetupSchedule schedule) {
        switch (schedule) {
            case FIRST:
                return date.with(TemporalAdjusters.firstInMonth(day));
            case SECOND:
                return date.with(ChronoField.DAY_OF_MONTH, 7)
                        .with(TemporalAdjusters.next(day));
            case THIRD:
                return date.with(ChronoField.DAY_OF_MONTH, 14)
                        .with(TemporalAdjusters.next(day));
            case FOURTH:
                return date.with(ChronoField.DAY_OF_MONTH, 21)
                        .with(TemporalAdjusters.next(day));
            case LAST:
                return date.with(TemporalAdjusters.lastInMonth(day));
            case TEENTH:
                return date.with(ChronoField.DAY_OF_MONTH, 12).with(TemporalAdjusters.next(day));
        }
        return LocalDate.now();
    }

    public static void main(String[] args) {

    }
}