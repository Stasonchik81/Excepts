import java.util.InputMismatchException;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        // ** 1 
        // System.out.println(inputFloat());

        // ** 2 Испраить код (1)
        int[] intArray = new int[9];
        try {
            int d = 0;
            // double doubleArr = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
        // ** 2 Испраить код (2)
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
      
         
         
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
        finally{
            sc.close();
        }
    }
    
    public static void printSum(Integer a, Integer b) throws Exception {
        System.out.println(a + b);
     }
     
}
