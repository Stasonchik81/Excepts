/* Реализуйте метод, принимающий в качестве аргумента целочисленный массив. 
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, 
в качестве кода ошибки, иначе - длину массива.
*/
const minLength = 10;
const myArr1 = [1, 2, 3, 5, 7, 9, 13, 15, 17, 20, 26]
const myArr2 = [1, 2, 3]
// const myArr2 = null
const myArr3 = [1, 2, 3, null, 5, null, 7]

function calc(arr) {
    return arr.length < minLength ? -1 : arr.length
}

// console.log(calc(myArr1));
// console.log(calc(myArr2));

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4.Напишите метод, в котором реализуйте взаимодействие с пользователем. 
То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
обработает возвращенное значение и покажет читаемый результат пользователю. 
Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.

*/
var readline = require('readline-sync');

const find = function (arr, num) {
    if(!arr)return -3
    if (arr.length < minLength) {
        return -1
    } else {
        let idx = -2;
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                idx = i;
            }
        }
    return idx;
    }
}

function letsFind() {
    let num = parseInt(readline.question("Input number: "))
    const code = find(myArr2, num)
    switch (code) {
        case -1:
            console.log("Длинна массива меньше 10!")
            break;
        case -2:
            console.log("Искомый элемент не найден")
            break;
        case -3:
            console.log("Массив для поиска отсутствует")
            break;
        default:
            console.log(`У элемента ${num} индекс ${code}`)
            break;
    }
}
// letsFind()


/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения: 
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), 
и в каждой ячейке может лежать только значение 0 или 1. 
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
*/
function gen2DArray(size) {
    const arr = []
    for (let i = 0; i < size; i++) {
        const arr2 = []
        for (let j = 0; j < size; j++) {
            arr2[j] = Math.round((Math.random())*2/2);
        }
        arr[i] = arr2
    }
    return arr;
}
// Тестирование ошибок
// **Генерируем первый массив 
const first = gen2DArray(5)
// **Получаем значение элемента в массиве отличное от 1 и 0
first[1][0] = 3
// console.log(first)
// **Получаем второй массив и делаем его нестандартного размера
const second = gen2DArray(5)
// second.push(first[0])
// console.log(second)

function sumOfElements(arr) {
    let sum = 0
    for (let i = 0; i < arr.length; i++) {
        const row = arr[i].reduce((acc, el) => acc+el, 0)
        sum+=row
    }
    return sum;
}
const calculateArr = (arr2D) => {
    if (arr2D) {
        arr2D.forEach(element => {
            if (element.length != arr2D.length) {
                throw new Error("Количество строк не соответствует количеству столбцов в массиве!")
            }else{
                for (let i = 0; i < element.length; i++) {
                    if (element[i] != 1 && element[i] != 0) {
                        throw new Error("В массиве присутствуют значения отличные от 0 и 1")
                    }
                }
            }
        });
        return sumOfElements(arr2D)
    } else {
        console.log('Массив пустой или отсутствует!')
    }
}

// try {
//     console.log(calculateArr(first))
// } catch (error) {
//     console.log(error.message)
// }


/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

*/
const checkArray = (arr)=>{
    let nulls = []
    for (let i = 0; i < arr.length; i++) {
        if(arr[i] == null){
            nulls.push(i)
        }
      }
    if(nulls){
        console.error(`Массив по индексам ${nulls} содержит null`)
        throw new Error("Массив содержит null")
    }
    else{
        console.log("С массивом всё ОК")
    }
}

console.log(myArr3)
try {
    checkArray(myArr3)
} catch (error) {
    console.log(error)
}
// console.log(checkArray(myArr2))