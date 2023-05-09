// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
// MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

package Seminar_3;

import java.util.zip.DataFormatException;

public class task4 {
    public static void main(String[] args) throws Exception {
        String[][] arr = new String[][] { { "1", "1", "1", "1" }, { "1", "1", "1", "1" }, { "1", "1", "1", "1" },
                { "1", "1", "1", "1" } };
        try {
            System.out.println(taskMethod(arr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int taskMethod(String[][] arr) throws Exception {
        int summary = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summary += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return summary;
    }
}


class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    String message = "Invalid size of array";

    @Override
    public String getMessage() {
        return message;
    }
}

class MyArrayDataException extends DataFormatException {
    String message = "Invalid data in indexes: ";

    public MyArrayDataException(int ind1, int ind2) {
        this.message = this.getMessage() + ind1 + " " + ind2;
    }

    @Override
    public String getMessage() {
        return message;
    }
}