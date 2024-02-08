// console.log("Hello World!")

// let text = "Hello world!"
// const text = "Hello world!" 
// console.log(text)


//model_name_car
// let model_name_car = "BMW" // snake_case
// let modelNameCar = "BMW"// camelCase
// let model-name-car = "BMW" // kebab-case ======= !!ERROR!!

// let for = "for"
//A-za-z0-9 $ _
// let 0a = "0a" // ============!!ERROR!!
// let _test = "test"
// let $test = "test"

//==========================================//

// let greeting = "Hello"
// greeting = "World"
// console.log(greeting)

// const stringValue = "text"
   //const stringValue = 'text'
// console.log(stringValue)

// const numberValue = 30
// const numberValue = 30.56
// const numberValue = 30.56
// console.log(numberValue)

//==========================================//

//  concatenation
// const name = "John"
// const lastName = "Dow"
// const fullName = name + " " + lastName
// const fullName = name + " " + lastName     =    Jon Dow
// console.log(fullName);

// interpolation
// Hello John Dow
// const fullName = `Hello ${name} ${lastName}`
// console.log(fullName);

//number
// const a = 8
// const b = 9
// const sum = a + b
// console.log(sum);

// =========================================//

// const numFirst = 5
// const numSecond = 10
// console.log(numFirst + numSecond) // сложение
// console.log(numFirst - numSecond) // вычитание
// console.log(numFirst * numSecond) // умножение
// console.log(numSecond / numFirst) // деление
// console.log(numSecond % numFirst) // остаток от деления
// console.log(numFirst ** 2) // возведение в степень

// =========================================//

// const userName = prompt("Send your name")
// console.log(`Hello ${userName} How are you?`)

// =========================================//

// const numFirst = 5
// const numSecond = 10
// if (numFirst < numSecond) {
//     console.log("numFirt меньше numSecond")
// } else {
//     console.log("numSecond меньше numFirt");
// }

// const r = 12
// const g = 34
// const b = 14
// //   ИНТЕРПОЛЯЦИЯ   //
// console.log(`"rgb (${r}, ${g}, ${b})"`);
// //   КОНКАТЕНАЦИЯ   //
// console.log("“rgb(" + r + ", " + g + ", " + b + ")”");

// =========================================//

// const numValue = 49
// console.log(typeof numValue)            //number
// console.log(typeof String(numValue))    // string

// const strValueNum = "56"
// console.log(typeof strValueNum);
// console.log(typeof Number(strValueNum));


// const strValue = "text"
// console.log(Number(strValue))  // NaN - Not a Number

// =========================================//

// console.log(4 + "2")    //   42
// console.log(5 - "2")    //   3
// console.log(4 - "abc")  //   NaN - Not a Number
// console.log(typeof NaN) //   number

// const numValue = "44"
// console.log(+numValue); //   Number(numValua)

// =========================================//

// Написать программу, которая считывает через prompt число и выводит в консоль ее квадрат

// const numValue = prompt("Write a number")
// console.log(numValue ** 2)

//   Написать программу, которая считывает два числа (объявляем две переменные и записываем туда результат работы двух вызовов prompt) и выводит их сумму. Не забыть преобразовать полученные значения в число.

// const firstNum = prompt("write a first number")
// const secondNum = prompt("write a second number")
// // console.log(+firstNum + +secondNum)
// // alert(+firstNum + +secondNum)
// alert("LOL")

// =========================================//

// let number = 7                   // =   равно        != не равно
                                // ==   сравнение    !== строгое не равно
// if (number == "7") {            // ===  строгое сравнение и типы данных тоже сравнивает
    // console.log("Равно")        //  >   больше
// } else {                        //  <   меньше
    // console.log("Не равно");    //  >=  больше или равно
// }                               //  <=  меньше или равно
                                   // &&   и
                                   // ||   или

// =========================================//

// let numValue = 6
// if (numValue > 0 && numValue < 10) {
//     console.log("Меньше 10 больше 0")
// } else {
//     console.log("else")
// }
// if (numValue > 0 || numValue < 5) {
//     console.log("Число либо меньше 5 либо больше 0")
// } else {
//     console.log("else")
// }

// =========================================//

// let str = "Hello world"
// console.log(isNaN(str))
// str = '566'


// const firstNum = prompt("write a first number")
// const secondNum = prompt("write a second number")
// if (firstNum > secondNum) {
//     console.log(firstNum)
// } else {
//     console.log(secondNum);
// } 


// =========================================//


// Написать программу, которая считывает через prompt одно число и выводит одну из строк “число положительное”, “число отрицательное”, “число равно нулю”.

const firstNum =+prompt("writef first number")
if (firstNum > 0) {
    console.log ("number positive")
} else if (firstNum < 0) {
    console.log("number negative")
} else {
    console.log("=0");
}

// =========================================//

