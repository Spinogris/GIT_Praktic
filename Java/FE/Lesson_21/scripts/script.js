// function printHello(username) {
//     console.log(`Hello ${username}`)
// }
 
// function printBye(username) {
//     console.log(`Bye ${username}`)
// }
 
// function printHowAreYou(username) {
//     console.log(`How are you ${username}`)
// }
 
// function doWithUser(username, callback) {
//     callback(username)
//     // console.log(callback)
// }
 
// doWithUser("John", printHello)
// doWithUser("John", printBye)
// doWithUser("Anna", printHowAreYou)

// ------------------------------------

// Написать функцию forEach, которая принимает в качестве первого аргумента массив, а в  качестве второго функцию и вызывает принятую функцию для каждого элемента массива.


// function forEach(arr, callback) {                   // 2
//     for (let i = 0; i < arr.length; i++) {
//         callback(arr[i])                            //  3
//     }
// }
// function callbackForArr(elem) {                     //  4
//     if (elem >= 0) {
//         console.log(elem);
//     }
// }
// // function pow(elem){
// //     console.log(elem**2);
// // }

// const arr = [5, 7, 56, 876, 54, 2, -5, 5, -9]
// forEach(arr, callbackForArr)                        //  1
// // forEach(arr, pow)

// ------------------------------------

// ------------------------------------   addeventList   ------------------------------------
// Совместно с преподавателем:
// Повесить событие клика на кнопку таким образом, чтобы при нажатии на нее в консоль выводилась строка. Жмак.

// const btn = document.querySelector("button")
// function clickHandler() {
//     console.log("Clicked")
// }
// btn.addEventListener("click", clickHandler)

// Переделать кнопку таким образом, чтобы при нажатии на нее в параграфе в интерфейсе значение увеличивалось на 1. В начале рассмотрите процесс, при котором мы каждый раз считываем число из параграфа, меняем и записываем обратно, а потом переделайте процесс так, чтобы значение хранилось в переменной, изменялось при клике и записывалось в параграф.
// const btn = document.querySelector("button")
// const pCounter = document.querySelector(".counter")
// let counter = 0
// function incr() {                           //  2
//     counter = counter + 1
//     pCounter.innerText = counter
// }
 
// btn.addEventListener("click", incr)         //  1

// Написать программу, которая создает две кнопки и вешает на них событие нажатия. При нажатии на плюс в консоль выводится число, увеличивающееся на 1, а при нажатии на минус - уменьшившееся на 1.
// 1 - создать кнопку с названием plusBtn
// 2 - к кнопке plusBtn добавить обработчик события для клика
// 3 - при нажатии на plusBtn передать callback функцию которая увеличивает значение счетчика на 1 и выводит в консоли
// 4 - создать кнопку с названием minusBtn
// 5 - к кнопке minusBtn добавить обработчик события для клика
// 6 - при нажатии на minusBtn передать callback функцию которая уменьшает значение счетчика на 1 и выводит в консоли
// 7 - добавить эти кнопки в body
// let counter = 0
// function incr() {
//     counter++
//     console.log(counter)
// }
// function decr() {
//     counter--
//     console.log(counter)
// }
// const plusBtn = document.createElement("button")
// plusBtn.innerText = "Plus"
// plusBtn.addEventListener("click", incr)
// const minusBtn = document.createElement("button")
// minusBtn.innerText = "Minus"
// minusBtn.addEventListener("click", decr)
// document.body.append(plusBtn, minusBtn)


// const btn = document.querySelector("button")
// function clickHandler(event) {
//     console.log("Clicked")
//     console.log(event);
// }
// btn.addEventListener("click", clickHandler)



// ------------------------------------   event   ------------------------------------
const pElem = document.querySelector("p")
document.addEventListener("keydown", function (event) {
    console.log(event)
    pElem.innerText +=event.key
})
// function add(callback) {
//     const obj = {
//         name: "John",
//         surname: "Smtih"
//     }

//     callback(obj)
// }

// add(function(param) {
//     console.log(param);
// })
// Написать программу, которая формирует на основе массива строк множество параграфов и выводит их в интерфейс. При клике на параграф текст должен меняться на звездочки.
// const pElem = document.querySelector("p")
// const words = ['Lorem', 'ipsum', 'dolor', 'sit', 'amet', 'consectetur', 'adipisicing', 'elit'] 
//     for (let i = 0; i < words.length; i++) {
//         const pElem = document.createElement("p")  //<p></p>
//         pElem.innerText = words[i]  //меняем текст
//         document.body.append(pElem)     
//         pElem.addEventListener("click", function (){
//             pElem.innerText = "LoL"
//         }) 
//     }



// В js объявлен массив с ссылками на картинки. На основе этого массива формируется множество маленьких картинок в верхней части интерфейса. При нажатии на одну из картинок забирается ссылка на эту картинку и в нижней части интерфейса отображается в большем размере. Так, пользователь нажимая на маленькие картинки видит их отображение в большем размере.

const images = ["https://upload.wikimedia.org/wikipedia/commons/8/80/140-P1020281_-_Flickr_-_Laurie_Nature_Bee.jpg", "https://avatars.mds.yandex.net/i?id=ac8f98ab623e6ac9f960456bcfdb7999dd326e2a-9181363-images-thumbs&n=13", "https://images.immediate.co.uk/production/volatile/sites/4/2021/08/mountains-7ddde89.jpg?resize=768,574", "https://where.ru/upload/iblock/ad4/ad4ef7e48f611b6be29e51e9aefaecd1.jpg"]
const thumbnailsDiv = document.querySelector(".thumbnails")
const previewImg = document.querySelector(".preview img")
for (let i = 0; i < images.length; i++) {
    const imgElem = document.createElement("img")
    imgElem.setAttribute("src", images[i])
    imgElem.setAttribute("alt", `image_${i}`)
    thumbnailsDiv.append(imgElem)
    imgElem.addEventListener("click", function() {
        console.log(imgElem.src)
        previewImg.setAttribute("src", imgElem.src)
        previewImg.setAttribute("alt", imgElem.alt)
    })
}