package HomeWork3;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import HomeWork3.Checks.Check;


import HomeWork3.Exceptions.CheckCountException;

public class main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input data in formats:\n Фамилия\tИмя\tДатарождения\tНомертелефона\tПол\n");
            String[] data = sc.nextLine().split(" ");
            Check ch = new Check();
            Field[] checks = ch.getClass().getDeclaredFields();
            // Проводим проверку введённых данных
            // ...
            if(isValid(checks, data)){
                StringBuilder resultString = new StringBuilder();
                for (String el : data) {
                    resultString.append(String.format("<%s>", el));
                }
                String lastN = data[0];
                try (FileWriter fwr = new FileWriter("./HomeWork3/myFiles" + lastN, true)) {
                    fwr.write(resultString.toString() + "\n");
                } 
                catch (Exception e) {
                    e.getStackTrace();
                }
            }
            // System.out.printf("Your firstname: %s \n", firstName);
        } catch (Exception e) {
            e.getStackTrace();
        }
        
    }
    // Реализовать метод проверки!
    public static boolean isValid(Field[]checks, String[] data) {
        if(checkCount() && checkDate() && checkTel() && checkMale()){
            return true;
            }
        else return false;
    }
    
   
   
}
