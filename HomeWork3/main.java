package HomeWork3;

import java.io.FileWriter;
import java.util.Scanner;
import HomeWork3.Checks.Check;
import HomeWork3.Exceptions.CheckCountException;
import HomeWork3.Exceptions.CheckDateException;
import HomeWork3.Exceptions.CheckMaleException;
import HomeWork3.Exceptions.CheckNameException;
import HomeWork3.Exceptions.CheckTelException;



public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input data in formats:\n Фамилия\tИмя\tДатарождения\tНомертелефона\tПол\n");
            String[] data = sc.nextLine().split(" ");
            
            // Проводим проверку введённых данных
            
            if(isValid(data)){
                StringBuilder resultString = new StringBuilder();
                for (String el : data) {
                    resultString.append(String.format("<%s>", el));
                }
                String lastN = data[0];
                try (FileWriter fwr = new FileWriter("./HomeWork3/myFiles/" + lastN, true)) {
                    fwr.write(resultString.toString() + "\n");
                } 
                catch (Exception e) {
                    e.getStackTrace();
                }
            }
        } catch (CheckCountException | CheckNameException | CheckDateException | CheckTelException | CheckMaleException e) {
            e.getMessage();
        }
        
    }
    // Метод проверки валидности данных
    public static boolean isValid(String[]fields) throws CheckCountException, CheckNameException, 
                                                            CheckDateException, CheckTelException, CheckMaleException {
        if(!Check.checkCount(5, fields)){
            throw new CheckCountException(5, fields.length);
        }
        if(!Check.checkName(fields[0], "[a-zA-Z]{3,}")){
            throw new CheckNameException("[a-zA-Z]{3,}",fields[0]);
        }
        if(!Check.checkName(fields[1], "[a-zA-Z]{3,}")){
            throw new CheckNameException("[a-zA-Z]{3,}",fields[1]);
        }
        if(!Check.checkDate(fields[2], "\\d{2}.\\d{2}.\\d{2,4}")){
            throw new CheckDateException("\\d{2}.\\d{2}.\\d{2,4}",fields[2]);
        }
        if(!Check.checkTel(fields[3], "\\+?[7,8]?9\\d{9}")){
            throw new CheckTelException(fields[3]);
        }
        if(!Check.checkMale(fields[4], "[f,m]{1}")){
            throw new CheckMaleException("[f,m]{1}",fields[4]);
        }
       
        return true; 
    }
    
   
   
}
