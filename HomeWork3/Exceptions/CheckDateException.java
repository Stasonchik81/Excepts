package HomeWork3.Exceptions;

public class CheckDateException extends Exception{
     private CheckDateException(String message){
        super(message);
    }
    public CheckDateException(String template, String date){
        this(String.format("Дата (%s) не соответствует шаблону - %s", date, template));
    }
}
