import java.util.GregorianCalendar;

public class GregorianCalendarExample {
    public static void main(String[] args) {
        // Задача 1: Отобразите текущий год, месяц и день
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // Месяц от 0 до 11, поэтому добавляем 1
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата: " + day + "/" + month + "/" + year);

    }
}