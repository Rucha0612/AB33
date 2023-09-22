package package1;
import java.util.Date;
public class TimeVariation1 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		//code for getting current time according to server time
		String currentdate = d2.toString();
		String date = currentdate.substring(8, 10);
		System.out.println(date);
		String month = currentdate.substring(4, 7);
		System.out.println(month);
		String year = currentdate.substring(24);
		System.out.println(year);
		
		String format1 = date.concat(month).concat(year);
		System.out.println(format1);
		String format2 = date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format2);
		String format3 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		String format4 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format4);
		
		//code for getting future time according to server time
		Date d3 = new Date(d1.getTime()+(24*60*60*1000*5)); 
		/*(24 = 1 day in hr , 24*60 = mins for 1 day, 24*60*60 = secs for 1 day and 
		24*60*60*1000 = miliseconds for 1 day,5 = no of days) & (plus(+) sign indicates 5 days after)*/
		System.out.println(d3);
		String currentdate1 = d3.toString();
		String date1 = currentdate1.substring(8, 10);
		System.out.println(date1);
		String month1 = currentdate1.substring(4, 7);
		System.out.println(month1);
		String year1 = currentdate1.substring(24);
		System.out.println(year1);
		
		String format5 = date1.concat(month1).concat(year1);
		System.out.println(format5);
		String format6 = date1.concat(" ").concat(month1).concat(" ").concat(year1);
		System.out.println(format6);
		String format7 = date1.concat("-").concat(month1).concat("-").concat(year1);
		System.out.println(format7);
		String format8 = date1.concat("/").concat(month1).concat("/").concat(year1);
		System.out.println(format8);
		
		//code for getting past time according to server time
		Date d4 = new Date(d1.getTime()-(24*60*60*1000*5)); 
		/*(24 = 1 day in hr , 24*60 = mins for 1 day, 24*60*60 = secs for 1 day and 
		24*60*60*1000 = miliseconds for 1 day,5 = no of days) & (minus(-) sign indicates 5 days earlier)*/
		System.out.println(d4);
		String currentdate2 = d4.toString();
		String date2 = currentdate2.substring(8, 10);
		System.out.println(date2);
		String month2 = currentdate2.substring(4, 7);
		System.out.println(month2);
		String year2 = currentdate2.substring(24);
		System.out.println(year2);
		
		String format9 = date2.concat(month2).concat(year2);
		System.out.println(format9);
		String format10 = date2.concat(" ").concat(month2).concat(" ").concat(year2);
		System.out.println(format10);
		String format11 = date2.concat("-").concat(month2).concat("-").concat(year2);
		System.out.println(format11);
		String format12 = date2.concat("/").concat(month2).concat("/").concat(year2);
		System.out.println(format12);
	}

}
