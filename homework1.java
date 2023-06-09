
class homework1{
    public static void main(String[] args) {
        String[][] myArr = {{"1", "2", "3", "4", "5"},
                            {"4", "5", "9", "7", "8"}};
        String [] first = {"1", "2", "3", "4", "5"};
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {2, 0, 6, 8, 10};                                
        // System.out.println(sum2d(myArr));
        // System.out.println(sumCounter(3, first));
        // System.out.println(div(5, 0));
        // Integer [] myNewArr = getArr(-5);
        // int[] resNums = difArray(nums1, nums2);
        int[] res = divArray(nums1, nums2);
    }
    // **Задание 1 
    // Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения
    // 1. java.lang.ArrayIndexOutOfBoundsException (Задано значение индекса массива, не принадлежащее допустимому диапазону.)
    // 2. java.lang.NumberFormatException (Строка, которая, как предполагалось должна содержать представление числа, не отвечает этому требованию.)
    // 3. java.lang.ArithmeticException (Возникла исключительная ситуация, связанная с ошибкой при выполнении арифметического вычисления)
    // 4. java.lang.NegativeArraySizeException (Предпринята попытка создания массива с размером, значение которого задано отрицательным числом.)
    // **1
    public static void copyArr(Integer[] from, Integer[] to) {
        for (int i = 0; i < to.length; i++) {
            int val = from[i];
                to[i] = val;
            }
    }
    public static int sumCounter(Integer count, String [] arr) {
        int sum = 0;
        do {
            sum+=Integer.parseInt(arr[--count]);
            // count--;
        } while (count>=0);
            return sum;
    }

    public static int div(Integer x1, Integer x2) {
        return x1 / x2;
    }

    public static Integer[] getArr(Integer num){
        Integer nums[] = new Integer[num];
       for (int i = 0; i < num; i++) {
         nums[i] = i;
       }
        return nums;
    }
    


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

    //  ** Задание 3 - Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов 
    // в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static int [] difArray(int[] firstArr, int[] secondArr){
        try {
            if (firstArr.length != secondArr.length) throw new Exception("First array is not equal second array!");
            int result[] = new int[firstArr.length];
            for (int i = 0; i < firstArr.length; i++) {
                result[i] = firstArr[i] - secondArr[i];
            }
            return result;
        } catch (Exception e) {
            // System.out.println(e.getMessage());
        
        return secondArr;}
    }
    // * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
    //  в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
    // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static int [] divArray(int[] firstArr, int[] secondArr){
        try {
            if (firstArr.length != secondArr.length) throw new RuntimeException("First array is not equal second array!");
            int result[] = new int[firstArr.length];
            for (int i = 0; i < firstArr.length; i++) {
                result[i] = firstArr[i] / secondArr[i];
            }
            return result;
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            System.out.println("Что то сломалось!");
            // e.printStackTrace();
        
        return secondArr;}
    }
    
}

