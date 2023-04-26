package HW_Seminar_2;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println("Your number: " + GetFloat());
    }

    public static float GetFloat() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter float number: ");
            String number = in.nextLine().replace(",", ".");
            try {
                float result = Float.parseFloat(number);
                return result;
            } catch (Exception e) {
                System.out.println("Invalid input: '" + number + "'.' Try again");
                return GetFloat();
            }
        }
    }
}
