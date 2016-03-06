import java.util.*;
public class checkIftwoDatesAreAmonthApart {
	
	public static void main(String args[]){
		Date d = new Date();
		Date d2 = new Date();
		d2 = addMonth(d2,1);
		System.out.println(d.toString());
		System.out.println(d2.toString());
		
		System.out.println(compareDateMonths(d,d2));
		
	}
	
	public static Date addMonth(Date date, int month)
	{
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.MONTH, month);//minus number would decrement the days
	    return cal.getTime();
	}
	
	public static int compare(Date date1, Date date2){
		return date1.compareTo(date2);
	}
	
	public static int compareDateMonths(Date date1, Date date2)
	{
	 Date earlier;
	 Date later;
	 int comparison = compare (date1, date2); 
	 if ( comparison == 0)
	 {
	   return -1;
	 } 
	 else if (comparison == -1)
	 {
	   earlier = date1;
	   later = date2;
	 } 
	 else
	 {
	   earlier = date2;
	   later = date1;
	 }

	 addMonth(earlier, 1);

	 return -(compare(earlier, later));
	}

}
