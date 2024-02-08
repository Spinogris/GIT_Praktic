package org.example._2023_12_06.taski.dryKissYagni;

import java.text.SimpleDateFormat;
import java.util.Date;

// Нарушение DRY: Дублирование кода
public class DateUtils {
    public static String formatDateForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
    public static String formatTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }
    
    // Дублирование кода создания SimpleDateFormat
    public static String formatDateTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }
}

// Исправлено:
// Избавились от дублирования кода, используя один и тот же объект SimpleDateFormat.
class DateUtilsQ {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
    private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public static String formatDateForDisplay(Date date) {
        return DATE_FORMAT.format(date);
    }
    
    public static String formatTimeForDisplay(Date date) {
        return TIME_FORMAT.format(date);
    }
    
    public static String formatDateTimeForDisplay(Date date) {
        return DATE_TIME_FORMAT.format(date);
    }
}