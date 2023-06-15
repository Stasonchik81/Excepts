package HomeWork3.Exceptions;

public class CheckNameException extends Exception{
    private CheckNameException(String message){
        super(message);
    }
    public CheckNameException(String template, String name){
        this(String.format("Имя или Фамилия (%s) не соответствует шаблону - %s", name, template));
    }
}
