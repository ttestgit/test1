import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.spi.CalendarNameProvider;

public class test {
    public static void main(String[] args) throws  Exception
    {
        /*Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("asdasd 2000 dsad as 3500 asfweroiu 34634 qweqw 3400");
        int sum = 0;
        while (matcher.find())
        {
            sum += Integer.parseInt(matcher.group());
        }
        System.out.println(sum);*/

        var format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        var date = new Date();
        System.out.println(format.format(date));

        var calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().getTime());

        System.out.println("enter birth date");
        var scanner = new Scanner(System.in);
        format = new SimpleDateFormat("dd.MM.yyyy");
        var line = scanner.nextLine();
        var birthDate = format.parse(line);
        calendar.setTime(birthDate);
        var now = Calendar.getInstance();
        for (calendar.get(Calendar.YEAR); calendar.get(Calendar.YEAR) <= now.get(Calendar.YEAR); calendar.add(Calendar.YEAR, 1)){
            var dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println("В " + calendar.get(Calendar.YEAR) + " году день рождения в: " + getDayOfWeekCaption(dayOfWeek));
        }
    }

    public static String getDayOfWeekCaption(int num) throws Exception{
        switch (num) {
            case 1: return "воскресенье";
            case 2: return "понедельник";
            case 3: return "вторник";
            case 4: return "среда";
            case 5: return "четверг";
            case 6: return "пятница";
            case 7: return "суббота";
            default: throw new Exception("Unknown day of week number");
        }
    }
}