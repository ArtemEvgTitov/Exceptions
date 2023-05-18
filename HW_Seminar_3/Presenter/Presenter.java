package HW_Seminar_3.Presenter;

import HW_Seminar_3.Console.View;
import HW_Seminar_3.Model.Person;
import HW_Seminar_3.Model.WriteToFile;

/**
 * Класс, содержащий запуск программы
 */
public class Presenter {

    /**
     * Метод запуска программы
     */
    public void run() throws Exception {

        View view = new View();
        Person person = null;
        WriteToFile file = new WriteToFile();

        view.StartMessage();

        while (true) {
            String string = view.GetString();
            if (string.equals("exit")) {
                break;
            }
            if (string.equals("help")) {
                view.StartMessage();
            } else {
                try {
                    person = new Person(string);
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\nДля вывода справки введите help");
                }
            }
            if (person != null) {
                try {
                    file.RecData(person);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
