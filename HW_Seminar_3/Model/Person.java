package HW_Seminar_3.Model;

import HW_Seminar_3.Presenter.Exceptions.*;

/**
 * Класс с конструктором Person
 */
public class Person implements IPerson, AutoCloseable {

    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String gender;

    /**
     * Конструктор Person
     */
    public Person(String string) throws Exception {
        String[] data = string.strip().split(" ");
        if (data.length != 6) {
            throw new ArrayError();
        }
        this.surname = data[0];
        this.name = data[1];
        this.patronymic = data[2];
        if (Check.CheckCalendar(data[3])) {
            this.birthday = data[3];
        } else {
            throw new DateError();
        }
        if (!Check.CheckPhone(data[4])) {
            throw new PhoneError();
        } else {
            this.phoneNumber = data[4];
        }
        if (!Check.CheckGender(data[5])) {
            throw new GenderError();
        } else {
            this.gender = data[5];
        }
    }

    @Override
    /**
     * Метод запроса фамилии
     */
    public String getSurname() {
        return surname;
    }

    @Override
    /**
     * Метод перевода Person в строку
     */
    public String toString() {
        return surname + ';' + name + ';' + patronymic + ';' + birthday + ';' + phoneNumber + ";" + gender + '\n';
    }

    @Override
    public void close() {
        this.surname = null;
        this.name = null;
        this.patronymic = null;
        this.birthday = null;
        this.phoneNumber = null;
        this.gender = null;
    }

}
