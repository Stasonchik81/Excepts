import java.util.InputMismatchException;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.println(inputFloat());
    }

    // **1 Метод, который запрашивает у пользователя ввод дробного числа
    // и возвращает введённое число. Ввод строки вместо числа не должен приводить к падению приложения, 
    //  вместо этого необходимо повторно запросить ввод.
    
    public static float inputFloat(){
        System.out.println("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод, попробуйте снова ...");
            return inputFloat();
        }
    }
}
