package HW_Seminar_3.Model;

import java.text.SimpleDateFormat;

/**
 * Класс с методами проверки введённых данных
 */
public class Check {

    /**
     * Метод проверки корректности ввода даты рождения
     */
    public static boolean CheckCalendar(String dateStr) {
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        date.setLenient(false);
        try {
            date.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Метод проверки корректности ввода номера телефона
     */
    public static boolean CheckPhone(String phone) {
        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Метод проверки корректности ввода пола
     */
    public static boolean CheckGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }

}
