package HW_Seminar_3.Presenter.Exceptions;

/**
 * Класс обработки количества введённых данных
 */
public class ArrayError extends ArrayStoreException {

    @Override
    public String getMessage() {
        return "[CAUTION] Количество переданных аргументов не равно 6\n";
    }

}
