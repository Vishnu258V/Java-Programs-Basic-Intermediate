package Date_28_12_2022;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTimeByZoneId {

	public static void main(String[] args) {

		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone);

		ZonedDateTime z = zone.withYear(1998);
		System.out.println(z);

		int m = zone.getDayOfMonth();
		int y = zone.getDayOfYear();
		DayOfWeek w = zone.getDayOfWeek();
		int m2 = zone.getMonth().getValue();

		System.out.println(m);
		System.out.println(y);
		System.out.println(w);
		System.out.println(m2);

		ZonedDateTime sub = zone.minusDays(100);
		System.out.println(sub);

		ZoneId zn = ZoneId.systemDefault();
		System.out.println(zn);

		String id = zn.getId();
		System.out.println(id);

		Set<String> avilablIds = ZoneId.getAvailableZoneIds();
		System.out.println(avilablIds);

		 avilablIds.forEach(ids -> System.out.println(ids));

		try {
			ZoneId s = ZoneId.of("America");
			System.out.println(s);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
