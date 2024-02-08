// const name = prompt("Enter your name");
// const status = prompt("Enter your status");

// if (status) {
//   if (status === "ADMIN") {
//     if (name === "Vlad") {
//       console.log("Ti ne samij glavnij admin");
//     } else if (name === "Ivan") {
//       console.log("Ti samij glavnij");
//     } else {
//       console.log("Privet noij Admin");
//     }
//   } else {
//     console.log("Privet prostoj sotrudnik");
//   }
// } else {
//   console.log("Vi ne vveli vash status");
// }

// 1
// в 222 строчке идет проверка был ли введено значение status если было введно
// то пусть заработает код от 223 по 233 строку.
//  2
//Если у нас status не введен то пусть заработает 235 строка
// 3
// Если Статус ADMIN то пусть заработает код от 225 по 230 строку
// 4
// Если статус не ADMIN то пусть заработает строка 232
// 5
// Если имя Vazgen то пусть сработает 225 строка
// 6
//Если имя Ivan то пусть сработает 227 строка
// 7 Если условие 5 и 6 не верны то пусть заработает 232 строка

// 2. Написать программу, которая получает два числа и выводит наименьшее
// const num1 = +prompt("Enter num1");
// const num2 = +prompt("Enter num2");
// let minValue;

// if (num1 > num2) {
//   minValue = num2;
// } else if (num2 > num1) {
//   minValue = num1;
// } else {
//   console.log("Entered Values are equal");
// }
// console.log(minValue);
// const minNumber = Math.min(num1, num2);
// console.log(minNumber);