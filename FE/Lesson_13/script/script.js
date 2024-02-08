// const arr = [5, 2, -9, 'Hello', 0, true, false]
// console.log(arr[3])   // 'Hello'
// console.log(arr[59])  // undefined

// arr [3] = 156
// console.log(arr);

// arr[2] = arr
// console.log(arr);

// ==================================================================== //

// arr.push("world", 654)    // add elems from end to array
// // arr.push(9987)
//  const lastElem = arr.pop()    // get last elem from array and delete it
// console.log(arr)
// console.log(lastElem)


// const empyArr = []
// empyArr.push(1, 4, 'árgh')
// console.log(empyArr);


// const mass = [1, 4, 2, 5, 3]
// const massNeu = []
// massNeu.push(mass[0]**2, mass[1]**2, mass[2]**2, mass[3]**2, mass[4]**2)
// console.log(massNeu)


// ================= //
// 1) i = 0; 0 < 10; i = 0 + 1
// 2) i = 1; 1 < 10; i = 1 + 1
// ...
// 9) i = 9; 9 < 10; i = 9 + 1
// 10) i = 10; 10 < 10; i = 10 + 1 // else
// for (let i = 0; i < 10; i = i + 1) {
//     console.log(i)
// }

//Разобрать пример вывода всех элементов массива при помощи цикла for.
// const arr = [1, 4, 2, 5, 3, 20, 32, 45]
// i = 0
// i = 1
// i = 2
// ... 
// i = 4
// for (let i = 0; i < arr.length; i = i + 1) {
//     if (typeof arr[i] === "number") {  
//     console.log(arr[i])
//  }
// } 

// for (let i = 0; i < arr.length; i = i + 1) {
//     console.log(arr[i]);
// } 

//  Написать цикл, который выводит только четные числа.

// const arr = [1, 4, 42, 15, 3, 7, 9, 32, 30] 
// for (let i = 0; i < arr.length; i = i + 1) {
//     if (arr[i] % 2 === 0) {
//         console.log(arr[i]);
//     }
// }


//   Разобрать синтаксис цикла с изменением i на два, три и так далее.
//   Разбор синтаксиса цикла от большего к меньшему

// for (let i = 100; i >= 0; i = i - 2) {
//     console.log(i);
// }


//   Разбор задачи на поиск агрегации по массиву. На примере суммы всех элементов массива.

// const arr = [1, 4, 42, 15, 3, 7, 9, 32, 30]

// let sum = 0
// for(let i = 0; i < arr.length; i++) {
//     sum = sum + arr[i]
// }

// console.log(sum)


// =============================================================== //
// let i = 2
// i = i + 1
// i += 1
// i++

// i = i - 1
// i -= 1
// i--

// i = i * 3
// i *= 3


//    Найти сумму четных и нечетных чисел из массива и вывести разницу между ними. Вычесть из большего меньшее.

const arr = [1, 4, 42, 15, 3, 7, 9, 32, 30]
let sumEven = 0
let sumOdd = 0
for(let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
        sumEven = sumEven + arr[i]
    } else {
        sumOdd = sumOdd + arr[i]
    }
}

console.log(sumEven);
console.log(sumOdd);

if (sumEven < sumOdd) {
    console.log(sumOdd - sumEven)
} else if (sumEven > sumOdd) {
    console.log(sumEven - sumOdd)
} else {
    console.log(0)
}