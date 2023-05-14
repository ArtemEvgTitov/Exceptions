package HW_Seminar_3.Presenter.Exceptions;

public class CopyStringException extends Exception {

    @Override
    public String getMessage() {
        return "[CAUTION] В базе уже есть идентичная строка, данный ввод пропускаем";
    }
}
