// -------------------------VAR LET CONST-------------------------
// // 1
// var name = "Vazgen"; // здесь создал переменную name = "Vazgen"
// var name = "Julia"; // здесь я пересоздал переменную name = "Julia"
// console.log(name);
// // 2
// let name2 = "Vazgen"; // здесь создал переменную name = "Vazgen"
// let name2 = "Julia"; // Identifier 'name2' has already been declared
// console.log(name2);

// Исходя из примера 1 и 2 можем результировать что с помощю VAR мы можем заного
// декларировать переменные с одним и тем же названием. А в LЕТ не можем

// // 3
// console.log(age); // undefined
// var age = 22;
// // 4
// console.log(age2); // Cannot access 'age2' before initialization
// let age2 = 22;

// // Исходя из примера 3 и 4 можем результировать что с переменные объявленные через VAR
// // можно использовать до их инициализации (создания), ошибки не будет а будет undefined.
// // Если сделаем тоже самое через LET, то будет ошибка что мы не можем обращятся к переменной до
// // ее инициализации

// // 5
// var myMoney = 100;
// myMoney = 200;

// let myName = "Vazgen";
// myName = "Igor";
// console.log(myMoney, myName); //200 'Igor'

// // 6
// const city = "New York";
// // city = "Berlin"; // Assignment to constant variable.
// console.log(city);

// // Исходя из примера 5 и 6 можем результировать что с переменные объявленные через VAR
// и LET, можно менять. A через CONST менять нельзя

// -------------------------JS TERMNIAL VS JS BROWSER-------------------------
// если мы работаем в термниале то будет ошибка: -  ReferenceError: prompt is not defined
// если будем работать в браузере то у нас просто отаброзится окно
// const age = +prompt("enter your age");
// console.log(age);

// let name = prompt("Send your name")
// let secondName = prompt("Send your Sekond name")
// let age = +prompt("Your age")
// console.log(`${name}, ${secondName}, ${age}`);

// Примитивы
// у переменный name, anotherNaem тип данных - строка
// let name = "Example";
// let anotherNaem = `Example2`;

// //  у переменной number, number2 тип данных число
// let number = 12345678; // 12345678
// let number2 = 1_500_000; // 1500000

//  у переменной isProgrammer, hasMoney тип данных boolean
// let isProgrammer = true;
// let hasMoney = false;

// у переменной hisName, herName тип данных undefined
// let hisName; // undefined
// let herName; //undefined

// у переменной sum NAN
// let sum = 123 / {}; // NaN -> Not A Number
// Примитивы

// Ссылочные типы данных
// let vazgenInfo = {
//   name: "Vazgen",
//   isProgrammer: true,
//   age: 22,
//   isMarried: undefined,
//   kids: null,
//   famili: {
//     father: "David",
//     mother: "Elza",
//   },

//   friends: ["Egor", "Nikita"],
// };
// const priceOfProduct = "7000";
// let text = "abcd";
// console.log(priceOfProduct + 100); // 7000100

// Число строку в другие типды данных
// 1 строку -> число
// const formatedPrice = Number(priceOfProduct);
// const formatedPrice2 = +priceOfProduct;
// const formatedData = Number(text); // NaN -> abcd никак нельзя переобрзовать в число
// const formatedData2 = +text; // NaN -> abcd никак нельзя переобрзовать в число

// 2 строку -> булево
// если в строке есть символ (пробел тоже считается символом) то проверим на условие то оно будет true,
// если строка пуста то будет false
// const boleanText = Boolean(text); // true
// const boleanText2 = Boolean(""); // false
// const boleanText3 = Boolean(" "); // true
// const boleanText4 = !!text; // true
// const boleanText5 = !!""; // false
// const boleanText6 = !!" "; // true

// Число в другие типы данных
// 1 число -> строку
// let number = 1000;
// let text1 = String(number);
// let text2 = number + "";
// let text3 = "" + number;
// // для тернарного оператора открываем ковычки ``, ставим $, открываем {}, и в них пишем перемнную или значние
// let text4 = `${number}`;
// let text5 = `${1 + 2 + 3}`; // ${6}
// let text6 = "${1 + 2 + 3}"; // ${1 + 2 + 3}
// console.log(text5);

// 2 Число в булево
// const num1 = 0;
// const num2 = 110;
// const num3 = -1;
// const num4 = 1;
// const num5 = -0;
// // Любое число кроме 0 и -0 это у нас true
// const bool1 = Boolean(num1); // false
// const bool2 = Boolean(num2); // true
// const bool3 = Boolean(num3); // true
// const bool4 = Boolean(num4); // true
// const bool5 = Boolean(num5); // false

// Пример
// const name = prompt("Enter your name");
// if (name) {
//   console.log(`Hello ${name}`);
// } else {
//   console.log(`You didnt enter your name`);
// }

// const value = +prompt("Enter your value");

// if (value) {
//   console.log(`You entered value: ${value}`);
// } else {
//   console.log(`You didnt enter any value`);
// }

