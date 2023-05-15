package HW_Seminar_3.Presenter.Exceptions;

/**
 * Класс обработки некорректого номера телефона
 */
public class PhoneError extends Exception {

    @Override
    public String getMessage() {
        return "[CAUTION] В номере присутствуют отличные от числа символы\n";
    }

}
