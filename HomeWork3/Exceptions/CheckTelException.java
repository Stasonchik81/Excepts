package HomeWork3.Exceptions;

public class CheckTelException extends Exception{
    
    public CheckTelException(String tel){
        super(String.format("Телефон %s не соответствует требованиям (целое беззнаковое число без форматирования)", tel));
    }
}
