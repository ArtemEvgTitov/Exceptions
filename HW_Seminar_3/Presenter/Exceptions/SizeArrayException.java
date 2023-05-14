package HW_Seminar_3.Presenter.Exceptions;

public class SizeArrayException extends ArrayStoreException {

    @Override
    public String getMessage() {
        return "Количество переданных аргументов не равно 6\n";
    }
}
