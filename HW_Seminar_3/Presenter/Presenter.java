package HW_Seminar_3.Presenter;

import HW_Seminar_3.Console.View;
import HW_Seminar_3.Model.Person;
import HW_Seminar_3.Model.WriteToFile;

public class Presenter {

    View view = new View();
    Person person = new Person();
    WriteToFile file = new WriteToFile();

    public void run() throws Exception {

        while (true) {
            view.StartMessage();
            String string = view.GetString();
            if (string.equals("exit")) {
                break;
            } else {
                try {
                    person.ParseString(string);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
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
