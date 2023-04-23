package HW_Seminar_1;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив, каждый элемент которого равен частному
 * элементов двух входящих массивов в той же ячейке. Если длины массивов не
 * равны, необходимо как-то оповестить пользователя. Важно: При выполнении
 * метода единственное исключение, которое пользователь может увидеть -
 * RuntimeException, т.е. ваше.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        int[] array2 = new int[] { 2, 3, 4, 5, 6 };
        try {
            int[] resArray = SummaryArray(array1, array2);
            for (int n : resArray) {
                System.out.println(n);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод разницы двух массивов
     * 
     * @return Новый массив с итоговыми значениями
     */
    public static int[] SummaryArray(int[] array1, int[] array2) {
        NotNullArrays(array1, array2);
        SizeArrays(array1, array2);

        int size = array1.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = array1[i] * array2[i];
        }
        return result;
    }

    /**
     * Метод проверки массивов на наполненность
     */
    public static void NotNullArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length < 1 || array2.length < 1) {
            throw new RuntimeException("One of the passed arrays is empty or null");
        }
    }

    /**
     * Метод проверки длин массивов
     */
    public static void SizeArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays lengths is not equal");
        }
    }
}
