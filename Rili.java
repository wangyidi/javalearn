import java.util.Calendar;
import java.util.GregorianCalendar;
public class Rili{
	public static void main(String[] args) {
		String month[] ={
		"Jan","Feb","Mar","Apr",
		"May","Jun","Jul","Aug",
		"Sep","Oct","Nov","Dsc"};
        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.println("Date: ");
        System.out.println(month[gcalendar.get(Calendar.MONTH)]);
        System.out.println(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(gcalendar.get(Calendar.YEAR));
	}
}
