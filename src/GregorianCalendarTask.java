import java.util.GregorianCalendar;

public class GregorianCalendarTask {
    public static void main(String[] args) {
        // Задача 1: Отобразите текущий год, месяц и день
        GregorianCalendar currentCalendar = new GregorianCalendar();
        int currentYear = currentCalendar.get(GregorianCalendar.YEAR);
        int currentMonth = currentCalendar.get(GregorianCalendar.MONTH) + 1; // Месяцы от 0 до 11
        int currentDay = currentCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата: " + currentDay + "/" + currentMonth + "/" + currentYear);

        // Задача 2: Установите время, равное 1234567898765L, и отобразите год, месяц и день
        GregorianCalendar customCalendar = new GregorianCalendar();
        customCalendar.setTimeInMillis(1234567898765L);
        int customYear = customCalendar.get(GregorianCalendar.YEAR);
        int customMonth = customCalendar.get(GregorianCalendar.MONTH) + 1; // Месяцы от 0 до 11
        int customDay = customCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Дата для времени 1234567898765L: " + customDay + "/" + customMonth + "/" + customYear);
    }
}