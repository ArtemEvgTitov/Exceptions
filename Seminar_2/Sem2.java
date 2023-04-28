package Seminar_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sem2 {

    // Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его
    // и обоснуйте свое решение.

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int[] array = new int[10];
    // System.out.println("Укажите индекс элемента массива, в который Вы хотите
    // записать единицу(1)");
    // int index = scanner.nextIn();
    // try {
    // array[index] = 1;
    // } catch (Exception e) {
    // System.out.println("Указан индекс за пределами массива");
    // }
    // }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Enter index of element of array that do you want write first value");
            int index = 0;
            try {
                index = in.nextInt();
            } catch (NumberFormatException | InputMismatchException err) {
                System.out.println("Invalid value for index");
            }
            try {
                arr[index] = 1;
            } catch (IndexOutOfBoundsException err) {
                System.out.println("Invalid index");
            }
        }
    }

    // Обработайте возможные исключительные ситуации.
    // “Битые” значения в исходном массиве считайте нулями.
    // Можно внести в код правки, которые считаете необходимыми.
    public static int sum2D(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static int Sum2D(String[][] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Array is empty or null");
        }
        int sum = 0;
        for (String[] strings : arr) {
            for (String string : strings) {
                try {
                    int val = Integer.parseInt(string);
                    sum += val;
                } catch (NumberFormatException err) {
                    System.out.println(err.getMessage());
                }
            }
        }
        return sum;
    }

    /**
     * Запишите в файл следующие строки:
     * Анна=4
     * Елена=5
     * Марина=6
     * Владимир=?
     * Константин=?
     * Иван=4
     * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
     * массив (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно
     * будет пройти по структуре данных, если сохранено значение ?, заменить его на
     * соответствующее число.Если на каком-то месте встречается символ, отличный от
     * числа или ?, бросить подходящее исключение.Записать в тот же файл данные с
     * замененными символами ?.
     * 
     */

    public static HashMap<String, Integer> GetLengthOfName(String path) {
        HashMap<String, Integer> names = new HashMap<>();
        BufferedReader file;
        try {
            file = new BufferedReader(new FileReader(path));
            String line = file.readLine();
            while (line != null) {
                String[] row = line.split("=");
                try {
                    int l = Integer.parseInt(row[1]);
                    names.put(row[0], l);
                } catch (Exception err) {
                    names.put(row[0], row[0].length());
                }
                line = file.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            ;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
        return names;
    }
}