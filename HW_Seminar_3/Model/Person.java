package HW_Seminar_3.Model;

public class Person implements IPerson, AutoCloseable {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String phoneNumber;
    private String gender;

    Person(String surname, String name, String patronymic, String birthday, String phoneNumber, String gender){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
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
