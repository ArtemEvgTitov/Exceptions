package HW_Seminar_3.Presenter.Exceptions;

/**
 * Класс обработки некорректной даты
 */
public class DateError extends RuntimeException {

    @Override
    public String getMessage() {
        return "[CAUTION] Неверно указана дата\n";
    }

}
