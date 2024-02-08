// // Если не используем функции
// // 1 Создать две переменны, в первой хранить значение 5 в дрогуй 3. После этого создать еще одну переменную которая ровна их сумме
// // const num1 = 5;
// // const num2 = 3;
// // const sum1 = num1 + num2; // 8
// // console.log({ sum1 });

// // // 2 Создать две переменны, в первой хранить значение 15 в дрогуй 23. После этого создать еще одну переменную которая ровна их сумме
// // const num3 = 15;
// // const num4 = 23;
// // const sum2 = num3 + num4; // 38
// // console.log({ sum2 });

// // Если использовать функцию
// function calcSum(num1, num2) {
//   const sum = num1 + num2;
//   return sum;
//   //   return num1 + num2;
// }

// // 1 Создать две переменны, в первой хранить значение 5 в дрогуй 3. После этого создать еще одну переменную которая ровна их сумме
// const result1 = calcSum(5, 3); // 8
// // 2 Создать две переменны, в первой хранить значение 15 в дрогуй 23. После этого создать еще одну переменную которая ровна их сумме
// const result2 = calcSum(15, 23); //48
// console.log({ result1, result2 });

// FUNCTION DECLORATION VS FUNCTION EXPRESSION VS ARROW FUNCTION

// FUNCTION DECLORATION
// на 35 строчки я создаю фунцкцию helloWorld без параметров, и в теле функции говорю что она должна мне возвращать текст
// function helloWorld() {
//   return `Hello everybody`;
// }
// // на 39 строке я создаю переменную которая ровна результату выполнения фунцкии helloWorld. Поскольку фунцкия нам возвращает "Hello everybody" значение переменной "result" ровно "Hello everybody"
// const result = helloWorld(); //Hello everybody
// console.log({ result });

// FUNCTION EXPRESSION
// На 45 строке я создаю переменную helloWorld(это будет именем моей фунцкии) и говорим ей в теле фунцкии что она должна возвращать строку
// const helloWorld = function () {
//   // возвращаем строку
//   return `Hello Everybody`;
// };

// const result = helloWorld(); //Hello everybody
// console.log({ result });

// ARROW FUNCTION

// const helloWorld = () => {
//   return `Hello Everybody`;
// };

// то что написали на стоке 55 по 57 это у нас тоже верно только если тело стрелочной функции состоит из одной строки мы можем не пистаь {}  и не писать клюучеове слово "return"
// const helloWorld = () => `Hello Eveybody`

// const result = helloWorld() // Hello Eveybody
// console.log({ result })

// FUNCTION DECLORATION VS FUNCTION EXPRESSION VS ARROW FUNCTION
// function printInfoAboutUser(name, surname, age, extraparametr) {
//   // extraparametr  у нас undefined посколькы во время вызова вызвоа функции мы передали 3 параметра а внтру тела функции мы хотим взят 4ый но его нет
//   // extraparametr: undefined;
//   console.log({ name, surname, age, extraparametr });
// }

// const personName = "Vazgen";
// const personSurname = "Davtyan";
// const personAge = 23;

// // функция которая вызвана на 217 строке получает правильную очередность параметров
// printInfoAboutUser(personName, personSurname, personAge, "а", "б", "c", "d");
// // Функция которая вызвана на 219 получает неправильную очередность поэтому в косноль логе // name: 'Vazgen', surname: 23, age: 'Davtyan'
// printInfoAboutUser(personName, personAge, personSurname, "а");

// а) Написать функцию которая принемает 3 параметра - имя пассажира, номер места в самалете, пол пассажира. И вывисти результат как строку учитывая пол то есть если Мужчина то "мужчина Иван сидит на месте A33", если пол женский то "женщина Анна сидит на месте B55"
// б) Если пол не указан то возвращать текст "Данный пассажир не может пользоватся данной компанией"
// в) Если у нас не указан номер билтеа но его дефолтное значение пусть будет "кабина"

// function airPlan() {
//     const Name = prompt("send your name")
//     const number = +prompt("send your number")
//     const sex = prompt("send your sex") 
//         if (!sex) {
//         console.log(`"Данный пассажир не может пользоватся данной компанией"`);
//     }   else if (!number) {
//         console.log(`кабина`);
//     }   else if (sex === "women" || sex === "w" || sex === "W") {
//         console.log(`Женщина ${Name} сидит на месте ${number}`)
//     }   if (sex === "man" || sex === "m" || sex === "M") {
//         console.log(`Мужчина ${Name} сидит на месте ${number}`)
//     }   else {
//         console.log(`Женщина ${Name} сидит на месте ${number}`)
//     } 
// }

// airPlan()


// --------------------------------   Home work   ---------------------------------------

// 1
// const functionThatReturnsMinimal = (num1, num2) => {
//   if (num1 > num2) {
//     return num2;
//   } else if (num1 < num2) {
//     return num1;
//   } else {
//     return "Оба чисал равны";
//   }
// };

// console.log(functionThatReturnsMinimal(1, 2));
// console.log(functionThatReturnsMinimal(2, 1));
// console.log(functionThatReturnsMinimal(2, 2));

// // 2 по возрастанию
// const getRange = (from, to) => {
//   for (let i = from; i <= to; i++) {
//     if (i % 2 === 0) {
//       console.log(i);
//     } else {
//       console.log("Не четное", i);
//     }
//   }
// };

// getRange(10, 20);

// 2 по убыванию
// const getRange = (from, to) => {
//   for (let i = to; i >= from; i--) {
//     if (i % 2 === 0) {
//       console.log(i);
//     } else {
//       console.log("Не четное", i);
//     }
//   }
// };

// getRange(10, 20);

// 3
// const pow = (baseNumber, times = 2) => {
//   return baseNumber ** times;
// };

// const result1 = pow(10); // 100 -> не указал в какой степени и по дефолту получилос 10 во 2ой степени
// const result2 = pow(2, 5); // 32
// const result3 = pow(3, 3); // 27
// console.log({ result1, result2, result3 });

// 4
// const startLoop = (number) => {
//   let sum = 0;
//   for (let i = 0; i < number; i++) {
//     sum += i;
//   }
//   return sum;
// };
// const result = startLoop(10);
// console.log(result);

// 5

// const countOfNumbers = (from, to) => {
//   let chotniye = 0;
//   let nechotnie = 0;

//   for (let i = from; i < to; i++) {
//     if (i % 2 === 0) {
//       chotniye += 1;
//     } else {
//       nechotnie += 1;
//     }
//   }

//   console.log({ chotniye, nechotnie });
// };

// countOfNumbers(0, 87);

//  6

// const arr = ['a', 'aa', 'aaa', 'aaaa', 'aaaaa']
// const getLongestText = (arrayOfStrings) => {
//     let longest = ''
//     for (let i = 0; i < arr.length; i++) {
//         if (arrayOfStrings[i].length > longest.length){
//             longest = arrayOfStrings[i]
//         }
        
//     }
//     console.log(longest);
// }
// getLongestText(arr)