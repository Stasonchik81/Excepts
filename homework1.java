class homework1{
    public static void main(String[] args) {
        String[][] myArr = {{"1", "2", "3", "4", "5"},
                            {"4", "5", "9", "7", "8"}};
        System.out.println(sum2d(myArr));
    }
    // **Задание 1 
    // Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения
    // 1. java.lang.ArrayIndexOutOfBoundsException (Задано значение индекса массива, не принадлежащее допустимому диапазону.)
    // 2. java.lang.NumberFormatException (Строка, которая, как предполагалось должна содержать представление числа, не отвечает этому требованию.)
    // 3. java.lang.ArithmeticException (Возникла исключительная ситуация, связанная с ошибкой при выполнении арифметического вычисления)
    // 4. java.lang.NegativeArraySizeException (Предпринята попытка создания массива с размером, значение которого задано отрицательным числом.)

    // **Задание 2 (получение исключений в коде)
    // 1) Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 (если размер массива меньше)
    // 2) Exception in thread "main" java.lang.NumberFormatException: For input string: "o" (если значение строки нельзя привести к числу)
    // 3) ...

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    
}

