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

      //2020年6月的firstDayOfWeek的值是3,也就是周二,查看API，SUNDAY的值是1,MONDAY是2以此类推
      int weekday = d.get(Calendar.DAY_OF_WEEK); //weekday = 3

      //获取星期的第一天,是星期天还是星期一
      int firstDayOfWeek = d.getFirstDayOfWeek();  //firstDayOfWeek = 1

      //确定第一行的缩进
      int indent = 0;
      /*
         通过while循环确定缩进是因为
         试想：firstDayOfMonth的值是2也就是周一，而weekday是SUNDAY其值是1,
         那么缩进的数量就是6,如果用其他方式处理就比较麻烦
       */
      while(weekday != firstDayOfWeek){
         indent++;
         d.add(Calendar.DAY_OF_MONTH, -1);
         weekday = d.get(Calendar.DAY_OF_WEEK);
      }
      //完成后indent=2

      //输出星期名称
      String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
      do{
         System.out.printf("%4s", weekdayNames[weekday]);
         d.add(Calendar.DAY_OF_MONTH, 1);
         weekday = d.get(Calendar.DAY_OF_WEEK);
      }while(weekday != firstDayOfWeek);
      System.out.println();
      for(int i = 0; i<indent;i++){
         System.out.print("    ");//由于上面用%4s格式化输出，所以这里用四个空格
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
