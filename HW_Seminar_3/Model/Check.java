package HW_Seminar_3.Model;

import java.text.SimpleDateFormat;

public class Check {

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

    public static boolean CheckPhone(String phone) {
        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean CheckGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }
}
