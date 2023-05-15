package HW_Seminar_3.Console;

/**
 * Класс общения с пользователем
 */
public class View {

    GetValue getString = new GetValue();
    SetValue setString = new SetValue();

    public String GetString() {
        String string = getString.getValue();
        return string;
    }

    public void SetString(String msg) {
        String string = setString.setValueString(msg);
        System.out.println(string);
    }

    public void StartMessage() {
        System.out.println(
                "\nВведите ФИО, ДР, телефонный номер и пол." +
                        "\nВсе элементы разделены пробелами, день рождения вводится в формате ДД.ММ.ГГГГ" +
                        "\nТелефонный номер содержит только числа, пол указываются латинские буквы: m (муж), f (жен)" +
                        "\nДанные должны соблюдать следующий формат:" +
                        "\nФамилия Имя Отчество дата_рождения телефонный_номер пол" +
                        "\nДля выхода введите exit\n");
    }

}
