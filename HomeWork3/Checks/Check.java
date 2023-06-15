package HomeWork3.Checks;

import java.util.regex.Pattern;
import java.util.ArrayList;

import HomeWork3.Exceptions.CheckCountException;
import HomeWork3.Exceptions.CheckNameException;
import HomeWork3.Exceptions.CheckDateException;
import HomeWork3.Exceptions.CheckMaleException;
import HomeWork3.Exceptions.CheckTelException;

/**
 * checkCount
 */
public class Check {

    // ** Метод проверки количества вводимых данных
     public static <T> boolean checkCount(int count, String[] fields) throws CheckCountException{
        
        if(fields.length != count){
            throw new CheckCountException(fields.length, count);
        }
        return true;
    }

    // ** Методы проверки введённых строковых данных (Имени, Фамилии, даты рождения, пола)

     public static boolean checkName(String name, String pattern) throws CheckNameException{
        
        if(!Pattern.matches(pattern, name)){
            throw new CheckNameException(pattern, name);
        }
        return true;
    }
    public static boolean checkDate(String date, String pattern) throws CheckDateException{
        
        if(!Pattern.matches(pattern, date)){
            throw new CheckDateException(pattern, date);
        }
        return true;
    }
    public static boolean checkMale(String male, String pattern) throws CheckMaleException{
        
        if(!Pattern.matches(pattern, male)){
            throw new CheckMaleException(pattern, male);
        }
        return true;
    }

    // ** Метод проверки телефона
    // public static boolean checkTel(String num) throws CheckTelException{
    //     // try {
    //     //     Integer.parseUnsignedInt(num);
    //     //     return true;
    //     // } catch (Exception e) {
    //     //     throw new CheckTelException(num);
    //     // }
        
       
    // }
    public static boolean checkTel(String num, String pattern) throws CheckTelException{
        if(!Pattern.matches(pattern, num)){
            throw new CheckTelException(num);
        }
        return true;
    }
    
}