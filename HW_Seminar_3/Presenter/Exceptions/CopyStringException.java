package HW_Seminar_3.Presenter.Exceptions;

public class CopyStringException extends Exception {

    @Override
    public String getMessage() {
        return "В базе уже есть идентичная строка";
    }
}
