package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String format(String pattern, Date date) {
        return formatDate(date, pattern);
    }

    public static String formatDefaut(Date date) {
        return formatDate(date, "dd/MM/yyyy HH:mm:ss");
    }

    private static String formatDate( Date date, String pattern){
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }
}
