import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) throws  Exception
    {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("asdasd 2000 dsad as 3500 asfweroiu 34634 qweqw 3400");
        int sum = 0;
        while (matcher.find())
        {
            sum += Integer.parseInt(matcher.group());
        }
        System.out.println(sum);
    }
}