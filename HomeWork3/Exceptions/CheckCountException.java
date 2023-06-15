package HomeWork3.Exceptions;

public class CheckCountException extends Exception{
    public CheckCountException(String message){
        super(message);
    }
    public CheckCountException(int count, int test){
        this(String.format("Ошибка в количестве данных! Введено - %d (не соответствует шаблону - %d)", count, test));
    }
}
