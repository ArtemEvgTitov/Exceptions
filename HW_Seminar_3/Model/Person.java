package HW_Seminar_3.Model;

import HW_Seminar_3.Presenter.Exceptions.*;

public class Person implements IPerson, AutoCloseable {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String gender;

    // Person(String surname, String name, String patronymic, String birthday, String phoneNumber, String gender) {
    //     this.surname = surname;
    //     this.name = name;
    //     this.patronymic = patronymic;
    //     this.birthday = birthday;
    //     this.phoneNumber = phoneNumber;
    //     this.gender = gender;
    // }

    public void ParseString(String str) throws Exception {
        String[] data = str.strip().split(" ");
        if (data.length != 6) {
            throw new SizeArrayException();
        }
        this.surname = data[0];
        this.name = data[1];
        this.patronymic = data[2];
        if (Check.CheckCalendar(data[3])) {
            this.birthday = data[3];
        } else {
            throw new InvalidDateException();
        }
        if (!Check.CheckPhone(data[4])) {
            throw new NotDigitInPhoneException();
        } else {
            this.phoneNumber = data[4];
        }
        if (!Check.CheckGender(data[5])) {
            throw new InvalidGenderException();
        } else {
            this.gender = data[5];
        }
    }

    public String getSurname() {
        return surname;
    }

    @Override
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
