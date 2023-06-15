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
     public <T> boolean checkCount(int count, ArrayList<T>data) throws CheckCountException{
        
        if(data.size() != count){
            throw new CheckCountException(data.size());
        }
        return true;
    }

    // ** Метод проверки введённых строковых данных (Имени, Фамилии, даты рождения, пола)
     public boolean checkName(String name, String pattern) throws CheckNameException{
        
        if(!Pattern.matches(pattern, name)){
            throw new CheckNameException(pattern, name);
        }
        return true;
    }
    public boolean checkDate(String date, String pattern) throws CheckDateException{
        
        if(!Pattern.matches(pattern, date)){
            throw new CheckDateException(pattern, date);
        }
        return true;
    }
    public boolean checkMale(String date, String pattern) throws CheckMaleException{
        
        if(!Pattern.matches(pattern, date)){
            throw new CheckMaleException(pattern, date);
        }
        return true;
    }

    // ** Метод проверки телефона
    public boolean checkTel(String num) throws CheckTelException{
        try {
            Integer.parseInt(num);
            return true;
        } catch (Exception e) {
            throw new CheckTelException(num);
        }
        
       
    }
    
}