package HW_Seminar_1;

import java.util.Scanner;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
 * получить?
 */

public class Task1 {
    public static void main(String[] args) {
        start();
    }

    /**
     * Старт программы. Дополнительные исключения можно получить при изменении
     * метода получения массива
     */
    public static void start() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = EnterIndex();
        System.out.println("Values with index " + index + " equals: " + GetValueFromArray(array, index));
    }

    /**
     * Метод запроса ввода индекса от пользователя
     * 
     * @return индекс
     */
    public static int EnterIndex() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter index of element (from 0 to 9): ");
            String first = in.nextLine();
            int index = CheckValueIndex(first);
            CheckRangeIndex(index);
            return index;
        }
    }

    /**
     * Метод преобразования из String в int с проверкой
     * 
     * @return либо число, либо RuntimeException
     */
    public static int CheckValueIndex(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            throw new RuntimeException("Invalid values for index");
        }
    }

    /**
     * Метод проверки значения индекса
     */
    public static void CheckRangeIndex(int index) {
        if (index > 9) {
            throw new RuntimeException("Index greater than 9");
        }
        if (index < 0) {
            throw new RuntimeException("Index less than 0");
        }
    }

    /**
     * Метод проверки массива
     */
    public static int GetValueFromArray(int[] arr, int index) {
        if (arr == null || arr.length < 1) {
            throw new RuntimeException("Array is empty or null");
        }
        if (arr.length > 10) {
            throw new RuntimeException("Array is greater than 10");
        }
        return arr[index];
    }
}
