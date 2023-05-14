package HW_Seminar_3.Presenter.Exceptions;

public class InvalidDateException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Неверно указана дата\n";
    }
}
