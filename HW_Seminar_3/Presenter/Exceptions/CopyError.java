package HW_Seminar_3.Presenter.Exceptions;

/**
 * Класс обработки повторяющихся данных
 */
public class CopyError extends Exception {

    @Override
    public String getMessage() {
        return "[CAUTION] В базе уже есть идентичная строка";
    }

}
