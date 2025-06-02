import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-05-27");
        LocalDateTime d05 = LocalDateTime.parse("2025-05-27T20:21:18");
        Instant d06 = Instant.parse("2025-05-27T20:21:18Z");

        DateTimeFormatter fmt1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d07 = LocalDate.parse("27/05/2025", fmt1);

        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d08 = LocalDateTime.parse("27/05/2025 20:35", fmt2);

        LocalDate d09 = LocalDate.of(2025, 5, 27);
        LocalDateTime d010 = LocalDateTime.of(2025, 5, 27, 20, 40);

        System.out.println("D01 = " + d01);
        System.out.println("D02 = " + d02);
        System.out.println("D03 = " + d03);
        System.out.println("D04 = " + d04);
        System.out.println("D05 = " + d05);
        System.out.println("D06 = " + d06);
        System.out.println("D07 = " + d07);
        System.out.println("D08 = " + d08);
        System.out.println("D09 = " + d09);
        System.out.println("D010 = " + d010);

        System.out.println("-------------------------------");
        DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("D04 = " + d04.format(ftm3));
        System.out.println("D04 = " + ftm3.format(d04));
        System.out.println("D04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter ftm4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("D05 = " + d05.format(ftm3));
        System.out.println("D05 = " + d05.format(ftm4));

        DateTimeFormatter ftm5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("D06 = " + ftm5.format(d06));
    }
}