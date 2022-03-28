import java.time.LocalDate;
import java.time.Period;


public class DateDifference {


public static void main (String args[])
{
	
LocalDate todaysdate = LocalDate.of(2022, 03, 28);
	LocalDate pastdate= LocalDate.of(1948, 01, 30);

	System.out.println(Period.between(pastdate, todaysdate));
	
	
	
	
	
}









}