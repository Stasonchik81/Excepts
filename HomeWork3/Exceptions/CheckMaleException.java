package HomeWork3.Exceptions;

public class CheckMaleException extends Exception{
    private CheckMaleException(String message){
        super(message);
    }
    public CheckMaleException(String template, String male){
        this(String.format("Пол (%s) не соответствует шаблону - %s", male, template));
    }
}
