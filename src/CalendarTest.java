import java.text.DateFormatSymbols;
import java.util.*;

/**
 * 显示当前月的日历
 */
public class CalendarTest {
   public static void main(String[] args){
      //当前日期
      GregorianCalendar d = new GregorianCalendar();

      int today = d.get(Calendar.DAY_OF_MONTH);
      int month = d.get(Calendar.MONTH);

      //设置本月开始日期
      d.set(Calendar.DAY_OF_MONTH, 1);

      int weekday = d.get(Calendar.DAY_OF_WEEK);

      //获取星期的第一天
      int firstDayOfWeek = d.getFirstDayOfWeek();

      //确定第一行的缩进
      int indent = 0;
      while(weekday != firstDayOfWeek){
         indent++;
         d.add(Calendar.DAY_OF_MONTH, -1);
         weekday = d.get(Calendar.DAY_OF_WEEK);
      }

      //输出星期名称
      String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
      do{
         System.out.printf("%4s", weekdayNames[weekday]);
         d.add(Calendar.DAY_OF_MONTH, 1);
         weekday = d.get(Calendar.DAY_OF_WEEK);
      }while(weekday != firstDayOfWeek);
      System.out.println();
      for(int i = 0; i<indent;i++){
         System.out.print("    ");
      }

      d.set(Calendar.DAY_OF_MONTH, 1);
      do{
         //输出日期
         int day = d.get(Calendar.DAY_OF_MONTH);
         System.out.printf("%3d", day);

         //当前日期标记*
         if(day == today)
            System.out.print("*");
         else
            System.out.print(" ");

         //日期增加
         d.add(Calendar.DAY_OF_MONTH, 1);
         weekday = d.get(Calendar.DAY_OF_WEEK);

         if(weekday == firstDayOfWeek)
            System.out.println();
      }while (d.get(Calendar.MONTH)==month);

      if(weekday != firstDayOfWeek)
         System.out.println();
   }
}
