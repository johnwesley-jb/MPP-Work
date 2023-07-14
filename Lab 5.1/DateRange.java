package lab5_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateRange {
    private LocalDate startDate;
    private LocalDate endDate;
    private DateTimeFormatter df;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;


    }

    public static LocalDate getFirstDayOfMoth(LocalDate d) {

        return d.withDayOfMonth(1);
    }

    public static LocalDate getLastDayOfMoth(LocalDate d) {

        return d.withDayOfMonth(d.lengthOfMonth());
    }

    public boolean isInRange(LocalDate d) {
       if (startDate.compareTo(d)>0) return false;
       if (endDate.compareTo(d)<0) return false;
        return true;
    }

    @Override
    public String toString() {
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return startDate.format(df) + " - " + endDate.format(df);
    }
}
