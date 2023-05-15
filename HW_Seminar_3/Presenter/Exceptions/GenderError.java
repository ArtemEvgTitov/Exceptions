package HW_Seminar_3.Presenter.Exceptions;

/**
 * Класс обработки некорректоного пола
 */
public class GenderError extends Exception {

    @Override
    public String getMessage() {
        return "[CAUTION] Неверно указан пол, необходимо указать f или m\n";
    }

}