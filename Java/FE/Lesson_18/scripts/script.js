// const p = document.querySelector("p")
// console.log(p) // Node
 
// const pElems = document.querySelectorAll("p")
// console.log(pElems) // nodelist collection
// for (let i = 0; i < pElems.length; i++) {
//     console.log(pElems[i])
// }
// // 1 - методы массивов не работают на nodelist [push, pop]
// 2 - nodelist коллекции могут быть жывими, реагировать на изменение dom дерева
// 3 - nodelist предостовляется в браузере а array встроен в js

// const p = document.querySelector("p")
// console.log(p.innerText)
// p.innerText = "hello world"

// const pSecond = document.querySelector(".paragraph_2")
// pSecond.innerText = "Second paragraph"

// Написать программу, которая находит параграфы по классу и заменяет в каждом из них текст на “привет”.
// const pElems = document.querySelectorAll(".text")
// for (let i = 0; i < pElems.length; i++) {
//     pElems[i].innerText = "привет"
// }


// Найти элемент с идентификатором main и записать в него текст “Я главный элемент”. 

// const divElems = document.querySelector("#main")
// divElems.innerText = "Я главный элемент"


const imgElems = document.querySelector("img")
const url ="http://juice-health.ru/images/comp/145.jpg"

imgElems.setAttribute("src", url)
imgElems.setAttribute("data-test", "Hello")

//Написать скрипт, который находит картинки в блоке с классом main и первым 5 картинкам меняет url на указанное значение.

const divImg = document.querySelectorAll(".main img")
const Url = "https://cdn.riastatic.com/photosnewr/ria/dom_news_logo/vash-lichnyj-dom-vash-aktiv__211674-620x0.jpg"
for(let i = 0; i < 5; i++) {
    divImg[i].setAttribute("src", Url)
}


// Написать скрипт, который находит все ссылки на странице и формирует массив со всеми адресами. В итоге этот массив необходимо вывести в консоль.

const aElem = document.querySelectorAll("a")
console.log(aElem.href)
const aMass = [] 
for(let i = 0; i < aElem.length; i++) {
    aMass.push(aElem[i].href)
} 
console.log(aMass)

