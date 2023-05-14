package HW_Seminar_3.Presenter.Exceptions;

public class InvalidGenderException extends Exception {
    
    @Override
    public String getMessage() {
        return "Неверно указан пол, необходимо указать f или m\n";
    }
}