import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedTimeDateExample {

    private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";

    public static void main(String[] args) {

        String dateInString = "22-01-2015 10:15:55 AM";
        LocalDateTime ldt = LocalDateTime.parse(dateInString,DateTimeFormatter.ofPattern(DATE_FORMAT));

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("TimeZone : " + singaporeZoneId);

        // LocalDateTime + ZoneId = ZonedDateTime
        ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) : " + asiaZonedDateTime);

        ZoneId newYokZoneId = ZoneId.of("America/New_York");
        System.out.println("TimeZone : " + newYokZoneId);

        ZonedDateTime nyDateTime = asiaZonedDateTime.withZoneSameInstant(newYokZoneId);
        System.out.println("Date (New York) : " + nyDateTime);

        ZoneId japan = ZoneId.of("Asia/Tokyo");
        System.out.println("Time Zone: " + japan);

        ZonedDateTime asiaJapanTime = ldt.atZone(japan);
        System.out.println("Date (Japan): " + asiaJapanTime);


        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        System.out.println("\n---DateTimeFormatter---");
        System.out.println("Date (Singapore) : " + format.format(asiaZonedDateTime));
        System.out.println("Date (New York) : " + format.format(nyDateTime));
       System.out.println("Date (Japan): " + format.format(asiaJapanTime));

    }
}
