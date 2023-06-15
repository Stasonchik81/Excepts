package HomeWork3.Exceptions;

public class CheckCountException extends Exception{
    public CheckCountException(String message){
        super(message);
    }
    public CheckCountException(int count){
        this(String.format("Ошибка в количестве данных! Введено - %d (не соответствует шаблону - 5"));
    }
}
