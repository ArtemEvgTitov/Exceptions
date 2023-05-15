package HW_Seminar_3.Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import HW_Seminar_3.Presenter.Exceptions.CopyError;

/**
 * Класс записи данных в файл
 */
public class WriteToFile implements IWriteToFile {

    @Override
    /**
     * Метод записи данных в файл
     */
    public void RecData(Person data) {

        String fileName = data.getSurname() + ".csv";

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Создан новый файл: " + data.getSurname() + ".csv\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        try (FileWriter writer = new FileWriter(fileName, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                Scanner reader = new Scanner(new File(fileName))) {
            reader.useDelimiter("\n");
            while (reader.hasNext()) {
                if (reader.next().equals(data.toString().strip())) {
                    throw new CopyError();
                }
            }
            bufferedWriter.write(data.toString());

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println("[INFO] Запись завершена\n");
    }

}
