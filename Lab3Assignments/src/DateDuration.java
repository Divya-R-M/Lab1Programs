
/*
 * Author : Divya R M
 * Date : 24/10/2020
 * Desc : To calculate the duration between user give date and system date.
 */
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

public class DateDuration {
	public static void main(String[] args) {
		LocalDate userDate = LocalDate.of(2021, 10, 06); // user date
		LocalDate currentDate = LocalDate.now(); // Current system date
		Period duration = Period.between(currentDate, userDate); // calculation the duration
		System.out.println("The duration is: " + duration.getYears() + " Years " + duration.getMonths() + " Months "
				+ duration.getDays() + " Days");
	}
}
