import java.time.*;
import java.time.temporal.*;
import java.io.*;
public class workingdaysafter
{

  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the date in yyyy-mm-dd format");
    String str=br.readLine();
    str=str.trim();
    System.out.println("Enter the no. of days to be added");
    int add_day=Integer.parseInt(br.readLine());
    LocalDate date1=LocalDate.parse(str);
    System.out.println(date1.getDayOfWeek());
    LocalDate date2=date1.plusDays(add_day);
    System.out.println(date2.getDayOfWeek());
    long count=calcWeekDays1(date1,date2);
    System.out.println("The no. of working days are" +count );
  }
  public static long calcWeekDays1(final LocalDate start, final LocalDate end) {
    final DayOfWeek startW = start.getDayOfWeek();
    final DayOfWeek endW = end.getDayOfWeek();

    final long days = ChronoUnit.DAYS.between(start, end);
    final long daysWithoutWeekends = days - 2 * ((days + startW.getValue())/7);

    //adjust for starting and ending on a Sunday:
    return daysWithoutWeekends + (startW == DayOfWeek.SUNDAY ? 1 : 0) + (endW == DayOfWeek.SUNDAY ? 1 : 0);
}
}