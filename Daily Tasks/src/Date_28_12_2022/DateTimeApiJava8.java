package Date_28_12_2022;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApiJava8 {
	public static void main(String[] args) {

		// Current local date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// Current local time with nano seconds
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Current local date and time with nano seconds
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		// Current local date with custom date pattern/format
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String dateCustomeFormat = dateFormat.format(date);
		System.out.println(dateCustomeFormat);

		String dateCstmFrmt2 = date.format(dateFormat);
		System.out.println(dateCstmFrmt2);

		// Current local time with custom time pattern/format
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

		String timeCustomeFormat = timeFormat.format(time);
		System.out.println(timeCustomeFormat);

		try {

			String timeFrmt2 = date.format(timeFormat);
			System.out.println(timeFrmt2);
			throw new Exception();

		} catch (Exception e) {

			System.out.println("\n" + e.getMessage() + "\nYou are trying to acces the time format for the date format ");

		}

		System.out.println("\nRest of the code-> ");

		String timeformat3 = time.format(timeFormat);
		System.out.println(timeformat3);

	}

}
