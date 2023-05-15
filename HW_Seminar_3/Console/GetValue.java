package HW_Seminar_3.Console;

import java.util.Scanner;

/**
 * Класс запроса ввода от пользователя
 */
public class GetValue implements IGetValue {

    Scanner in = new Scanner(System.in);

    @Override
    /**
     * Метод запроса ввода от пользователя
     */
    public String getValue() {
        System.out.print("Введите данные --> ");
        return in.nextLine();
    }

}
