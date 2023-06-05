class homework1{
    public static void main(String[] args) {
        String[][] myArr = {{"1", "2", "3", "4", "5"},
                            {"4", "5", "9", "7", "8"}};
        System.out.println(sum2d(myArr));
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
    
}

