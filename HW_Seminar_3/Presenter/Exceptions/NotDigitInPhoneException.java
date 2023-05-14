package HW_Seminar_3.Presenter.Exceptions;

public class NotDigitInPhoneException extends Exception {

    @Override
    public String getMessage() {
        return "В номере присутствуют отличные от числа символы\n";
    }
}
