package W13_july11_tusk9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1990, 5, 20); // ВСТАВ_СЮДА: Дата вашого дня народження
        LocalDateTime currentDateTime = LocalDateTime.now();

        calculateTimePassed(birthdate, currentDateTime);
    }

    public static void calculateTimePassed(LocalDate birthdate, LocalDateTime currentDateTime) {
        Period period = Period.between(birthdate, currentDateTime.toLocalDate());
        Duration duration = Duration.between(birthdate.atStartOfDay(), currentDateTime);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("Вам виповнилося " + years + " років, " + months + " місяців, " + days + " днів, " +
                hours + " годин, " + minutes + " хвилин та " + seconds + " секунд");
    }
}
