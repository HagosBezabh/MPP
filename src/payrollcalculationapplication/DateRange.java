package payrollcalculationapplication;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class DateRange {
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	public DateRange(GregorianCalendar startDate,GregorianCalendar endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public boolean isInRange(GregorianCalendar date){
		if(date.after(startDate)&&date.before(endDate))
			return true;
		else
			return false;
	}
	public String toString(){
		return "From "+startDate.get(Calendar.DAY_OF_MONTH)+", "+
				startDate.get(Calendar.MONTH)+", "+startDate.get(Calendar.YEAR)+"to  "+
				" "+endDate.get(Calendar.DAY_OF_MONTH)+", "+
				endDate.get(Calendar.MONTH)+", "+endDate.get(Calendar.YEAR);
	}
	public static Date getFirstDayOfMonth(GregorianCalendar g){
		//return null;
		//return startDate.get(Calendar.DAY_OF_MONTH);
		Calendar c = g.getInstance();
		int firstDate = c.getActualMinimum(Calendar.DATE);
		c.set(Calendar.DAY_OF_MONTH, firstDate);
		return c.getTime();
	}
	public static Date getLastDayOfMonth(GregorianCalendar g){
		Calendar c = g.getInstance();
		int lastDate = c.getActualMaximum(Calendar.DATE);
		c.set(Calendar.DAY_OF_MONTH, lastDate);
		return c.getTime();
	}
}
