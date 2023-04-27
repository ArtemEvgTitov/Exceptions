package HW_Seminar_2;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит
 * пустую строку. Пользователю должно показаться сообщение, что пустые строки
 * вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("You entered: " + GetString());
    }

    public static String GetString() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter: ");
            String string = in.nextLine();
            try {
                if (string == "") {
                    throw new RuntimeException("Empty line");
                }
                return string;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return GetString();
            }
        }
    }
}
