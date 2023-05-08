// Создайте класс исключения, который будет выбрасываться при делении на 0.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.
// Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
// Исключение должно отображать понятное для пользователя сообщение об ошибке
// Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
// Исключение должно отображать понятное для пользователя сообщение об ошибке.

package Seminar_3;

import java.io.IOException;

public class task3 {
    public static void main(String[] args) {
        try {
            throw new DivZero();
        } catch (DivZero e) {
            System.out.println(e.getMessage());
        }

        try {
            Integer[] arr = new Integer[] { 1, 2, 3, null, 4 };
            for (Integer integer : arr) {
                System.out.println(integer);
                if (integer == null) {
                    throw new NullElem();
                }
            }
        } catch (NullElem e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new FileNotFound();
        } catch (FileNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}

class DivZero extends ArithmeticException {
    String message = "Division by zero";

    @Override
    public String getMessage() {
        return message;
    }
}

class NullElem extends NullPointerException {
    String message = "Element is null";

    @Override
    public String getMessage() {
        return message;
    }
}

class FileNotFound extends IOException {
    String message = "File not found";

    @Override
    public String getMessage() {
        return message;
    }
}